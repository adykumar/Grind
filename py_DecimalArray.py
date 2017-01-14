#-------------------------------------------------------------------------------
# Name:        module11
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     24/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def incrementer(arr):
    i= len(arr)-1
    arr[i]=arr[i]+1
    carry=0
    while(i>=1):
        if arr[i]==10:
            arr[i]=0; arr[i-1]=arr[i-1]+1
        i=i-1
    if arr[0]==10:
        arr[0]=0
        return [1]+arr
    return arr
def main():
    arr=[9,9,9,9,9,9]
    print arr
    print incrementer(arr)

if __name__ == '__main__':
    main()
