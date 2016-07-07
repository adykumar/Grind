# The grind starts with this program - Swadhyaya Kumar
# Let's roll!!

# BINARY SEARCHING OF ARRAY

# Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].

import sys

inFile= sys.argv[1]
outFile= sys.argv[2]

def writer(st):
	fout= open(outFile,"a")
	fout.write(str(st)+"\n")
	fout.close()
def main():
	fin= open(inFile,"r")
	all= fin.readlines()
	fin.close()
	fout= open(outFile,"w")
	fout.close()
	T= int(all[0])
	i=0
	while(i<T):
		arr= all[(2*i)+1].split()
		arr = [int(x) for x in arr]
		x= int(all[(2*i)+2])
		l=0
		n= len(arr)
		r=n-1
		flag=0
		while l<=r:
			mid= (l+r)/2
			print i,l,r,mid
			if   x== arr[mid]:
				writer(mid)
				flag=1
				break
			elif x < arr[mid]:
				r= mid-1
			else:	l= mid+1
		if flag==0: writer(-1)
		i+=1	
			 
	

if __name__=="__main__":
	main()
