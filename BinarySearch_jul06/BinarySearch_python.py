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
def error(a):
	if a==1: print "Invalid input: wrong N"
	if a==2: print "Wrong input...recheck"
	sys.exit(0)
def main():
	fin= open(inFile,"r")
	all= fin.readlines()
	fin.close()
	fout= open(outFile,"w")
	fout.close()
	T= int(all[0])
	i=0
	while(i<T):
		try: N= int(all[(3*i)+1])
		except: error(1)
		arr= all[(3*i)+2].split()
		arr = [int(x) for x in arr]
		if N!=len(arr): error(1) 
		x= int(all[(3*i)+3])
		l=0
		n= len(arr)
		r=n-1
		flag=0
		while l<=r:
			mid= (l+r)/2
			#print i,l,r,mid
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
