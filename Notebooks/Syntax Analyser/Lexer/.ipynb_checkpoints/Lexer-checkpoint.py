import numpy as np
import re

#file imports
path_tokens = 'tokens.txt'
path_reserved = 'reserved.txt'

# reserved set
f = open(path_reserved)
reserved_set = set([x.strip() for x in f.readlines()])
f.close()

#Generate all regex we will need

# Util
regex = {
    'id' : '[_a-zA-Z_]*[A-Za-z0-9]+[_A-Za-z0-9_]*',
    'string': r'(["])(?:(?=(\\?))\2.)*?\1',
    'numerico' : '[+-]?[0-9]+(?:\.[0-9]+)?(?:[eE][+-][0-9]+)?',
    'comment' : '#'
}
# Token Regex - Awuful
f = open(path_tokens,'r')
token_array = [x.strip().split('\t') for x in f.readlines()]
tokens = [x[0] for x in  token_array]
f.close()

token_set = {k:v for k,v in token_array}

token_regex = r''.join('(?:'+re.escape(y)+')|' for y in [x[0] for x in  token_array])[:-1]

# Util

def whileFullMatch(reg, line, c, start = 0): #returns last column from line reference and full matched string
    col = start+1
    #print(len(line))
    while(col < len(line) and re.fullmatch(reg,c)):
        c += line[col]
        col += 1
    
    if(re.fullmatch(reg, c)):
        return col, c
    return col-1, c[:-1]
    '''
    for p in line[col:]:
        c+=p
        if not re.fullmatch(reg,p):
            print(c)
            c = c[:-1]
            break
        col+=1
    '''
    
    return col, c

def untilFullMatch(reg, line, c, start = 0): #return las column fro line reference and full matched string
    col = start+1
    #print(line)
    #print(len(line))
    while(col < len(line) and not re.fullmatch(reg,c)):
        c += line[col]
        col += 1
    
    if(re.fullmatch(reg, c)):
        return col, c
    return col-1, c[:-1]

def getMore(line, col, n=1): #gets the next n characters from line starting in com
    if col+n > len(line):
        return len(line),line[col:]
    return col+n, line[col:col+n]

class Token:
    def __init__(self,row,col,_type = None, lexeme = None):
        self.row = row + 1
        self.col = col + 1
        self.token_type = _type
        if lexeme:
            self.lexeme = lexeme
        else:
            self.lexeme = _type
        self.error = False
        
    def parse(self):
        if not self.token_type and not self.lexeme:
            return '>>> Error lexico(linea:{},posicion:{})'.format(self.row,self.col)
        if self.lexeme == self.token_type:
            return '<{},{},{}>'.format(self.token_type, self.row, self.col)
        return '<{},{},{},{}>'.format(self.token_type, self.lexeme, self.row, self.col)

class Lexer:
    def __init__(self, filepath):
        self.filepath = filepath
        self.flag = False #Flag for numeric special case
        self.error = False
        
    def readFile(self):
        f = open(self.filepath,'r')
        self.lines = f.readlines()
        f.close()
        #reset
        self.displacement = self.row = self.col = 0
        self.flag = self.error = False
    
    def cleanLine(self, line):
        l = 0
        for c in line:
            if(c==' '):
                self.col+=1
            elif(c=='\t'):
                self.col += 1
                self.displacement += 3
            else:
                break
            l+=1
        return line[l:].strip()
    
    def number(self, c, line):
        # the col we use here is local
        # the self.col currently 
        global regex
        reg = regex['numerico']
        col, match = whileFullMatch(reg, line, c)

        t_col, two_more = getMore(line, col, n = 2)
        if re.match(r'[\.][0-9]', two_more):
            match += two_more
            col = t_col
            col, match = whileFullMatch(reg, line, match, col - 1) # col - 1 because function adds one
        
        t_col, three_more = getMore(line, col, n = 3)
        if re.match(r'[eE][\+-][0-9]', three_more):
            match += three_more
            col = t_col
            col, match = whileFullMatch(reg, line, match, col - 1) # col - 1 because function adds one
        tk = Token(self.row, self.col + self.displacement,'tk_num', match)
        self.col += col #increment for the next read
        
        self.flag = False # Numeric special case
        return tk
    
    def identifier(self, c, line):
        global regex, reserved_set
        reg = regex['id']
        col, match = whileFullMatch(reg, line, c)
        #print(col,match)
        if match in reserved_set:
            tk = Token(self.row, self.col + self.displacement, match)
            
            #print(tk.token_type, tk.lexeme)
            self.col += col #increment for the next read
            
            self.flag = False # Numeric special case
            return tk
        
        tk = Token(self.row, self.col + self.displacement,'id', match)
        self.col += col #increment for the next read
        
        self.flag = True # numeric special case
        return tk
    
    def tokenMatch(self, c, line):
        global token_regex, token_set
        
        if(not re.match(token_regex, c)):
            tk = Token(self.row, self.col + self.displacement) #Error Token
            self.error = True
            return tk
        
        col, match = whileFullMatch(token_regex, line, c)
        tk = Token(self.row, self.col + self.displacement, token_set[match])
        self.col += col #increment for the next read
        
        self.flag = False # Numeric special case
        return tk

    def default(self, c, line):
        if(re.match(r'[0-9]', c)):
            #print('>>>NUM')
            return self.number(c, line)
        elif(re.match(r'[a-zA-Z_]', c)):
            #print('>>>ID')
            return self.identifier(c,line)
        else:
            #print('>>>TOKEN_MATCH')
            return self.tokenMatch(c,line)
    
    def sign(self, c, line):
        t_col, one_more = getMore(line, 1)
        if re.match(r'[0-9]', one_more):
            if not self.flag:
                # case, include minus sign within number
                self.col +=1
                tk = self.number(c+one_more, line[1:])
                tk.col-=1
                return tk
        
        self.flag = False # Numeric special case
        return self.tokenMatch(c, line)
    
    def stri(self, c, line): #strings
        global regex
        reg = regex['string']
        col, match = untilFullMatch(reg, line, c)
        if (re.fullmatch(reg, match)):
            tk = Token(self.row, self.col + self.displacement, 'tk_cadena', match)
            self.col += col
            self.flag = False # Numeric special case
            return tk
        
        tk = Token(self.row, self.col + self.displacement) #Error Token
        self.error = True
        self.flag = False # Numeric special case
        return tk
    
    def dot(self, c, line):
        t_col, two_more = getMore(line, 1, n=2)
        if c+two_more == '...':
            tk = Token(self.row, self.col + self.displacement,'tk_slice')
            self.col+=3
            self.flag = False # Numeric special case
            return tk
        self.flag = False # Numeric special case
        return self.default(c,line)
    
    def nextToken(self):
        if self.error: return ''
        flag = True
        line = ''
        while(line == ''):
            if self.row >= len(self.lines): return ''
            line = self.lines[self.row][self.col:]
            line = self.cleanLine(line)
            if line == '' or line[0] == '#': # commentaries handling
                self.row += 1
                self.col = 0
                self.displacement = 0
                line = ''
        #Process
        c = line[0]
        opt = {
            '+' : self.sign,
            '-' : self.sign,
            '"' : self.stri,
            '.' : self.dot
        }
        f = opt.get(c, self.default)
        #print('-----------')
        #print(line)
        #print(">>",c)
        token = f(c, line)
        #print(self.row+1, self.col+1)
        return token