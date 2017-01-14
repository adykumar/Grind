#-------------------------------------------------------------------------------
# Name:        module7
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     20/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
# hanoi
count=0
def hanoi(fr,to,mid,n):
    global count
    if n<1: return
    count=count+1
    hanoi(fr,mid,to,n-1)
    to.append(fr[-1]); del fr[-1]
    hanoi(mid,to,fr,n-1)

def main():
    a=[5,4,3,2,1]
    b=[]
    c=[]
    n= len(a)
    hanoi(a,b,c,n)
    print a,b,c
    print count

if __name__ == '__main__':
    main()
