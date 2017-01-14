#-------------------------------------------------------------------------------
# Name:        module11
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     25/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def merge2(arr1,arr2):
    res=[]
    l1= len(arr1)-1; l2= len(arr2)-1
    i=0; j=0;
    while i<=l1 and j<=l2:
        if arr1[i]<=arr2[j]:
            res.append(arr1[i])
            i=i+1
        else:
            res.append(arr2[j])
            j=j+1
    if i>l1:
        return res+arr2[j:l2+1]
    return res+arr1[i:l1+1
]
def main():
    arr1=[-3,1,3,6,7,7,11,11,12]
    arr2=[0,2,2,3,4,5,8,11,11,11,21,22,23,24,34]
    print arr1,arr2
    print sorted(arr1+arr2)
    print merge2(arr1,arr2)

if __name__ == '__main__':
    main()
