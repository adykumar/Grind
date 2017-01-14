#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     26/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def twosum(arr, target):
  hmap={}
  for i in range(len(arr)):
    if target - arr[i] in hmap: return [i , hmap[target-arr[i]]]
    else: hmap[arr[i]]=i
  return []

def main():
    arr=[3,2,4]; target=6
    print twosum(arr,target)

if __name__ == '__main__':
    main()
