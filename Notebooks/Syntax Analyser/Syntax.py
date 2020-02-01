import Lexer.Lexer as lx
import re

default_depth = 600
max_depth = default_depth

grammar_path = 'grammar2.txt'
file_path = 'input.txt'
token_path = 'Lexer/tokens.txt'
reserved_path = 'Lexer/reserved.txt'
ENTRYPOINT = 'MAIN'
LAMBDA = 'e'

derivation = [ENTRYPOINT, "$"]
lexer = lx.Lexer(file_path)
token_lexeme = {}


class SyntaxBuilder:
    def __init__(self,path_grammar, init_symbol = 'S', null_value = 'e', verbose = False):
        self.verbose = verbose
        self.path_grammar = path_grammar
        
        self.init_symbol = init_symbol
        self.null_value = null_value
        self.grammar = {}
        self.non_terminals = set()
        
        self.first = {}
        
        self.following = {}
        self.explored = set() #set to keep state of following
        
        self.predictions = {}
        self.getProd = []
        self.getId = {}
        
    def loadGrammar(self):
        f = open(self.path_grammar)
        lines = f.readlines()
        f.close()
        id_ = 0
        for line in lines:
            line = line.strip().split()
            if line == [] or line[0][0:2]=='//': continue
            if line[0] not in self.grammar:
                self.non_terminals.add(line[0])
                self.first[line[0]] = set()
                self.following[line[0]] = set()
                self.predictions[line[0]] = {}
                self.grammar[line[0]] = []
            
            self.getProd.append(line[1:])
            self.getId[str(line[1:])] = id_
            self.predictions[line[0]][id_] = set()
            self.grammar[line[0]].append(line[1:])
            id_+=1
        self.following[self.init_symbol] = {'$'} # Add to first symbol
        
    def primeros(self, v, precalc = False):
        global max_depth
        max_depth-=1
        
        if max_depth <=0 or len(v)==0:
            #print('MAX_DEPTH REACHED')
            max_depth+=1
            return {self.null_value}
        
        if len(v) == 1 and v[0]== self.null_value:
            max_depth+=1
            return {self.null_value}
        
        if v[0] not in self.non_terminals:
            max_depth+=1
            return {v[0]}
        
        if len(v) == 1 and v[0] in self.non_terminals:
            #print('<<<<<',v[0])
            if precalc: return self.first[v[0]] # Used when we have already calculated it for non-terminals
            
            productions = self.grammar[v[0]] 
            first = set()
            for p in productions:
                first |= self.primeros(p)
            max_depth+=1
            self.first[v[0]] |= first
            return first
        
        first = self.primeros([v[0]])
        
        if self.null_value in first:
            if len(v)>1:
                first.discard(self.null_value)
                first |= self.primeros(v[1:])
        max_depth+=1
        return first
    
    
    def siguiente(self, non_terminal): # S is the non-terminal
        global max_depth, default_depth
        
        self.explored.add(non_terminal)
        
        for production in self.grammar[non_terminal]:
            for i in range(len(production)):
                p = production[i]
                if p in self.non_terminals:
                    if p not in self.explored:
                        self.siguiente(p)
                    
                    max_depth = default_depth
                    first = self.primeros(production[i+1:])
                    
                    self.following[p] |= first - {self.null_value}
                    if self.null_value in first:
                        self.following[p].add(non_terminal)
    def predict(self, S, prod):
        first = self.primeros(prod, False)
        if self.null_value in first:
            first.discard(self.null_value)
            return first | self.following[S]
        else:
            return first
        
    def calcFirsts(self):
        global max_depth, default_depth
        if self.verbose: print('INICIO CALCULO DE PRIMEROS')
        for S in self.grammar:
            max_depth = 600
            if self.verbose: print('>>>>',S)
            self.primeros([S])
        if self.verbose: print('FIN CALCULO DE PRIMEROS')
    
    def calcFollowing(self):
        if self.verbose: print('INICIO CALCULO DE SIGUIENTES')
        for non_terminal in self.non_terminals:
            if non_terminal not in self.explored:
                self.siguiente(self.init_symbol)
        
        added = True #Placeholder, does nothing
        while added:
            added = False
            for non_terminal in self.non_terminals:
                if self.verbose: print('>>>>',non_terminal)
                current = self.following[non_terminal].copy()
                for element in self.following[non_terminal]:
                    if element in self.non_terminals:
                        to_add = self.following[element]
                        added = True
                        current |= to_add
                        current -= {non_terminal}
                        current -= {element}
                self.following[non_terminal] = current
                
        if self.verbose: print('FIN CALCULO DE SIGUIENTES')
    
    def calcPredictions(self):
        if self.verbose: print('INICIO CALCULO DE PREDICCIONES')
        for k,productions in self.grammar.items():
            for production in productions:
                self.predictions[k][self.getId[str(production)]] = self.predict(k,production)
                if self.verbose: print('>>>>',k,'>>>',production)
        if self.verbose: print('FIN CALCULO DE PREDICCIONES')
    def calculateAll(self):
        self.calcFirsts()
        self.calcFollowing()        
        self.calcPredictions()


# ------ UTIL ----------

def get_lexeme(type_):
    global token_lexeme
    
    if type_ in token_lexeme: return token_lexeme[type_] #if token is tk_???
    return type_ # if token is reserved word

def loadTkSymb():
    global token_to_symb,token_path, token_lexeme
    f = open(token_path)
    token_array = [x.strip().split('\t') for x in f.readlines()]
    f.close
    token_lexeme = {k:v for v,k in token_array}

# --------- MAIN ------------

def mainExists(file_path):
    # Here we find main on file
    lexer = lx.Lexer(file_path)
    lexer.readFile()
    tk = lexer.nextToken()
    while (tk.lexeme != '$'):
        if tk.lexeme == 'resource': return True
        tk = lexer.nextToken()
    return False

def getNewPrefix(non_terminal, token_type):
    global grammar
    predictions = grammar.predictions[non_terminal]
    print("<<<PREDICTIONS: ")
    allTk = set()
    for i, prediction in predictions.items():
        allTk |= prediction
        print("<<<<<<<<<<<<<",grammar.getProd[i],prediction)
        if token_type in prediction:
            return grammar.getProd[i]
    
    return list(allTk - grammar.non_terminals) # In case we cannot solve the prefix

def derivate():
    global derivation, lexer, grammar, file_path, LAMBDA
    lexer = lx.Lexer(file_path)
    lexer.readFile()
    tk = lexer.nextToken()
    prefix = []
    while(len(derivation)):
        print("-------------")
        a = derivation[0]
        print(">>>>",derivation)
        print("<<<TK: ",tk.parse())
        if a in grammar.non_terminals: # Expand
            new_prefix = getNewPrefix(a ,tk.token_type)
            
            while len(new_prefix) and new_prefix[0] == LAMBDA:
                new_prefix = new_prefix[1:]
            
            derivation = new_prefix + derivation[1:]
            prefix = new_prefix
            
            print('')
        
        elif a == tk.token_type: # Match
            tk = lexer.nextToken()
            derivation = derivation[1:]
        else:
            print("-----", derivation)
            print("-----TK: ", tk.parse())
            return tk, prefix # It means we have unsatisfied expected values
    return tk, [] # it means it finished correctly

def execute():
    global derivation, ENTRYPOINT
    derivation = [ENTRYPOINT, "$"]
    
    tk, answer = derivate()
    
    if len(answer): # We have not found a proper derivation
        answer = str([get_lexeme(a) for a in answer]).strip('[]')
        print('<{},{}> Error sintactico: se encontro>: "{}"; se esperaba: {}.'.format(tk.row, tk.col, get_lexeme(tk.token_type), answer))
        return
    
    # we finished the code processing
    print('El analisis sintactico ha finalizado exitosamente.')


def main():
    global file_path, lexer
    loadTkSymb()
    if not mainExists(file_path):
        print('Error sintactico: falta funcion_principal')
        return
    
    execute()

if __name__ == '__main__':
    # If calculate all gets stuck, check where it stopped by enabling verbose in the grammar
    # Ex. grammar = SyntaxBuilder(grammar_path, ENTRYPOINT, LAMBDA, True)
    
    grammar = SyntaxBuilder(grammar_path, ENTRYPOINT, LAMBDA)
    grammar.loadGrammar()
    grammar.calculateAll()
    
    # When you identify the one that gets stuck, try to run it like this to check if it ends
    #grammar.primeros(['Expr'])
    
    # print(grammar.predictions) # Uncomment to show predictions
    
    
    main()