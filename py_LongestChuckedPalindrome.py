#-------------------------------------------------------------------------------
# Name:        module4
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     18/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
# longest chunked palindrome
def lcp(st):
    print st,
    chunks=0
    left=0; right= len(st)-1;
    i=left; j=right;
    while(i<j):
        ls= st[left:i+1]
        rs= st[j:right+1]
        if ls==rs:
            chunks=chunks+2
            print ls,rs,
            if i+1==j: return chunks
            left=i+1
            right=j-1
        i=i+1; j=j-1;
    return chunks+1

def main():
    stream=["vollvo","ghiabcdefhelloadamhelloabcdefghi","merchant","antaprezatetzapreanta","anaprezatepzapreana"]
    for each in stream:
        print lcp(each)

if __name__ == '__main__':
    main()
