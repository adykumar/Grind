
lis=[]
def genpar(n,o,c,st):
    if o>n or c>o: return
    if n==o and o==c: lis.append(st)
    genpar(n,o+1,c,st+"(")
    genpar(n,o,c+1,st+")")


def generateParenthesis( n):
    genpar(n,0,0,"")

def main():
    generateParenthesis(3)
    print lis

if __name__ == '__main__':
    main()
