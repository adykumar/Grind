# 4 keys split problem
# Explained: dutch national flag problem separates 3 keys into distinct bands in time O(n), space O(1)
# Is it possible to do that with 4 keys? Mauritius National Flag
def swap(arr,i,j):
    temp= arr[i]
    arr[i]=arr[j]
    arr[j]= temp

def mnf(arr):
    pivot= arr[0]
    left=1
    right= len(arr)-1
    while(left<right):
        if arr[left]==pivot:
            left=left+1
        else:
            swap(arr,left,right)
            right=right-1
    # now proceed to do dutch national flag for arr[i:len(arr)]
    print left
    return arr
def main():
    arr=[1,0,2,3,3,2,1,1,0,3,2,2,3,0,0,0,1]
    print mnf(arr)

if __name__ == '__main__':
    main()
