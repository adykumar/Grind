#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     17/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def  counting(s):
    sdict= {}
    l= len(s)
    for i in range(0,l-1):
        left=i; right=i+1
        x=0; y=0;
        print i,"--"
        while(left>=0 and right<l):
            st= s[left:right+1]
            print st,
            if s[left]=='0': x=x+1
            else: y=y+1
            if s[right]=='0': x=x+1
            else: y=y+1
            if x==y:
                if st not in sdict: sdict[st]=1
            left=left-1; right=right+1;
    print sdict
    return len(sdict)

def main():
    print counting("10101")

if __name__ == '__main__':
    main()
