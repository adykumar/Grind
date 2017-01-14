#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     30/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def genpar(arr, op, cl, mx, st):
    #print arr,op,cl,mx,st
    if op<mx: genpar(arr, op+1, cl, mx, st+"(")
    if cl<op: genpar(arr, op, cl+1, mx, st+")")
    if len(st)== 2*mx:
        arr.append(st)
        return

def genparen(n):
    arr=[]; st=""
    genpar(arr, 0, 0, n, st)
    return arr

def main():
    print genparen(3)

if __name__ == '__main__':
    main()
