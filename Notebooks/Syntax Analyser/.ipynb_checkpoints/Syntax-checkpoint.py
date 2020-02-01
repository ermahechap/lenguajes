import Lexer.Lexer as lx
import re

default_depth = 600
max_depth = default_depth

class SyntaxBuilder:
    def __init__(self,path_grammar, init_symbol = 'S'):
        self.path_grammar = path_grammar
        
        self.init_symbol = init_symbol
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
            if line == [] or line[0]=='//': continue
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
        print(v)
        global max_depth
        max_depth-=1
        
        if max_depth <=0 or len(v)==0:
            #print('MAX_DEPTH REACHED')
            max_depth+=1
            return {'e'}
        
        if len(v) == 1 and v[0]=='e':
            max_depth+=1
            return {'e'}
        
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
        
        if 'e' in first:
            if len(v)>1:
                first.discard('e')
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
                    
                    self.following[p] |= first - {'e'}
                    if 'e' in first:
                        self.following[p].add(non_terminal)
    def predict(self, S, prod):
        first = self.primeros(prod, False)
        if 'e' in first:
            first.discard('e')
            return first | self.following[S]
        else:
            return first
        
    def calcFirsts(self):
        global max_depth, default_depth
        for S in self.grammar:
            max_depth = 600
            print("PROCESSING ----",S)
            self.primeros([S])
    
    def calcFollowing(self):
        
        for non_terminal in self.non_terminals:
            if non_terminal not in self.explored:
                self.siguiente(self.init_symbol)
        
        added = True #Placeholder, does nothing
        while added:
            added = False
            for non_terminal in self.non_terminals:
                current = self.following[non_terminal].copy()
                for element in self.following[non_terminal]:
                    if element in self.non_terminals:
                        to_add = self.following[element]
                        added = True
                        current |= to_add
                        current -= {non_terminal}
                        current -= {element}
                self.following[non_terminal] = current
    
    def calcPredictions(self):
        for k,productions in self.grammar.items():
            for production in productions:
                self.predictions[k][self.getId[str(production)]] = self.predict(k,production)
    
    def calculateAll(self):
        print("<<<INIT FIRST")
        self.calcFirsts()
        print(">>>FIRST DONE")
        print("<<<INIT FOLLOWING")
        self.calcFollowing()
        print(">>>FOLLOWING DONE")
        print("<<<INIT PREDICTIONS")
        self.calcPredictions()
        print(">>>PREDICTIONS DONE")

        