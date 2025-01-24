# Enter your code here. Read input from STDIN. Print output to STDOUT


def main():
    while True:
        try:
            userInput = input().strip()
            if(toSplit(userInput)):
                print(firstCharS(userInput))
            else: 
                print(firstCharC(userInput))
        except EOFError:
            break

#Method
def isMethod(usrIn):
    if(usrIn[2] == 'M'):
        return True
    return False

def isClass(usrIn):
    if(usrIn[2] == 'C'):
        return True
    return False
    
def isVariable(usrIn):
    if(usrIn[2] == 'V'):
        return True
    return False    
    
#Split    
def toSplit(usrIn):
    if(usrIn[0] == 'S'):
        return True
    return False
 

    
def firstCharS(userInput):
    typeChar = userInput[2]
    
    userInput = userInput[4:]
    output = "";
    for x in userInput:
        if(x.isupper()):
            output += " " + x.lower()
        else:   
            output += x
            
    if typeChar == 'M':
        output = output.replace('()', '') 
              
    output = output.lower()
    return output.strip()
    
#COMBINE    
def firstCharC(userInput):
    typeChar = userInput[2]
    
    space = False
    output = "";
    userInput = userInput[4:]
    
    for x in userInput:
        if(x == " "):
            space = True
        elif space:   
            output += x.upper()
            space = False
        else:
            output += x
            
    if typeChar == 'M':
        output += "()" 
        
    if typeChar == 'C':
        output = output[0].upper() + output[1:]
    
    return output
    
if __name__ == "__main__":
    main()
