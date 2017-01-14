#-------------------------------------------------------------------------------
# Name:        module9
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     20/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
# IS STRING PERMUTABLE INTO PALINDROME
def canPermToPalin(st):
    dic={}
    for letter in st:
        if letter not in dic: dic[letter]=1
        else: dic[letter]=dic[letter]+1
    count=0
    for entry in dic:
        if dic[entry]%2!=0: count=count+1
    if count>1: return False
    return True

def main():
    lis=["edified","level","rotator","floof","hjf"]
    for each in lis:
        print each,canPermToPalin(each)

if __name__ == '__main__':
    main()
