#-------------------------------------------------------------------------------
# Name:        module7
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     31/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
import Queue

def k_avg(arr,k):
    rolling_avg=[]
    i=0
    q= Queue.Queue(maxsize=0)
    sum=0.0
    for j in range(k):
        sum=sum+arr[i]
        q.put(arr[i])
        i=i+1
    avg= sum/k
    rolling_avg.append(avg)
    while i<len(arr):
        left= q.get()
        avg= avg+ ((arr[i]-left)/k)
        rolling_avg.append(avg)
        q.put(arr[i])
        i=i+1

    return rolling_avg

def main():
    arr=[4,5,6,10,2]
    k=3
    print k_avg(arr,k)

if __name__ == '__main__':
    main()
