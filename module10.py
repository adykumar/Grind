#-------------------------------------------------------------------------------
# Name:        module10
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     20/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def max_subarray(arr):
    left=-1
    minsum=0
    maxsum=0
    sum=0
    r=arr[0]
    for i in range(len(arr)):
        sum=sum+arr[i]
        if sum<minsum:
            minsum=sum
            left=i
        if sum-minsum>maxsum:
            maxsum= sum-minsum
            r= arr[left+1:i+1]
    return r
def main():
    arr=[904,40,523,12,-335,-385,-124,481,-31]
    print max_subarray(arr)

if __name__ == '__main__':
    main()
