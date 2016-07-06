# The grind starts with this program - Swadhyaya Kumar
# Let's roll!!

# BINARY SEARCHING OF ARRAY

# Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].

import sys

inFile= sys.argv[1]
outFile= sys.argv[2]

def writer(st):
	fout= open(outFile,"w")
	fout.write(str(st)+"\n")
	fout.close()
def main():
	fin= open(inFile,"r")
	all= fin.readlines()
	fin.close()
	arr= all[0].split()
	arr = [int(x) for x in arr]
	x= int(all[1])
	#print arr,x
	l=0
	n= len(arr)
	r=n-1
	#mid= (l+r)/2
	while l<=r:
		mid= (l+r)/2
		print l,r,mid
		if   x== arr[mid]:
			writer(mid)
			exit(0)
		elif x < arr[mid]:
			r= mid-1
		else:	l= mid+1
	writer(-1)	
			 
	

if __name__=="__main__":
	main()
