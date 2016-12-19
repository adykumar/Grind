#-------------------------------------------------------------------------------
# Name:        module7
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     19/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def lexico_next(lis):
    right= len(lis)-1
    if right==0: return []
    while(lis[right]<lis[right-1]):
        right=right-1
        if right==0: return lis
    temp= lis[right-1]
    lis[right-1]=lis[-1]
    lis[-1]=temp
    print lis
    x= lis[0:right]+sorted(lis[right:len(lis)])
    sx= [str(i) for i in x]
    print ''.join(sx)


def main():
    list1= [1,0,7,5,4,3,2]
    print list1
    lexico_next(list1)

if __name__ == '__main__':
    main()
