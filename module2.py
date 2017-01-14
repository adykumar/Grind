#-------------------------------------------------------------------------------
# Name:        module2
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     17/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def main():
    arr= sorted([900,940,950,1100,1500,1800])
    dep= sorted([910,1200,1120,1130,1900,2000])
    print arr
    print dep
    l= len(arr)
    current=0
    a=0;d=0
    mg=0
    while(a<l and d<l):
        print arr[a],arr[d],
        if arr[a]<dep[d]:
            current=current+1
            a=a+1
        else:
            current=current-1
            d=d+1
        if mg< current: mg=current
        print current
    print mg

if __name__ == '__main__':
    main()
