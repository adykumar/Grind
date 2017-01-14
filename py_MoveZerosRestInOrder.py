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
def swap(arr,i,j):
    temp= arr[i]
    arr[i]=arr[j]
    arr[j]=temp

def bubble_zeros(arr):
    # have to move zeros to the left, order of rest should be unaffected
    right= len(arr)-1
    while arr[right]!=0:
        right=right-1
    i=right

    while i>=0:
        if arr[i]!=0:
            swap(arr,i,right)
            right=right-1
        i=i-1
    return arr

def main():
    arr=[1,0,3,4,1,8,0,2,0,1,3]
    print arr
    print bubble_zeros(arr)

if __name__ == '__main__':
    main()
