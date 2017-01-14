#-------------------------------------------------------------------------------
# Name:        module3
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     17/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def  count_palindromes( S):
    l= len(S)
    count=0
    for i in range(0,l):
        left= i; right=i;
        while(left>=0 and right<l):
            print "\n*",S[left:right+1], "-",S[right:left-1:-1],
            if len(S[left:right+1])==1 or (S[left:right+1] == S[right:left-1:-1]):
                count=count+1
                print 1,
            left=left-1
            right=right+1
        left2= i; right2=i+1;
        while(left2>=0 and right2<l):
            print "\n**",S[left2:right2+1], S[right2:left2-1:-1],
            if S[left2:right2+1] == S[right2:left2-1:-1]:
                count=count+1
                print 1,
            left2=left2-1
            right2=right2+1
    return count
def main():
    count_palindromes("wowpurerocks")
    s= "worldr"
    print "999",s[4:0:-1]

if __name__ == '__main__':
    main()
