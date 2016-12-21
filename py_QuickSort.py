# QUICK SORT ALGO: n log n

def partition(arr,left,right):
    pivot= arr[left]
    i=left+1
    for j in range(left+1,right+1):
        if arr[j]<=pivot:
            temp= arr[i]; arr[i]=arr[j]; arr[j]=temp;
            i=i+1
    temp= arr[left]; arr[left]=arr[i-1]; arr[i-1]=temp;
    return i-1

def quicksort(arr,left,right):
    if left>=right: return
    pindex= partition(arr,left,right)
    quicksort(arr,left,pindex-1)
    quicksort(arr,pindex+1,right)
    return arr


def main():
    arr= [2,3,-4,2,5,-1,0,2,11]
    print quicksort(arr,0,len(arr)-1)

if __name__ == '__main__':
    main()
