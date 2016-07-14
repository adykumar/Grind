import sys

def findArrayLeader(arr):
	result=[]
	right= len(arr)-2
	while right>=0:
		if arr[right]>arr[right+1]: 	 result.append(arr[right])
		else:				 arr[right]= arr[right+1]
	return result

 
def main():   #driver function
	T= int(input())  #test cases
	for i in range(T):
		N= int(input()) # number of elements
		if N<=0:
			print "N,T has to be > 0"
			return
		arr=[]
		for j in range(N):
			arr= input()
			#arr=[]
			#for j in range(N):
			#	arr.append(int(raw_input()))
			#print findArrayLeader(arr),"\n"
			print arr
		

if __name__== "__main__":
	main()
