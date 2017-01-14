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
# testing anagrams

def anagroup(lis):
    dic={}
    for each in lis:
        key= ''.join(sorted(each))

        if key not in dic:
            dic[key]=[]
            dic[key].append(each)
        else:
            dic[key].append(each)
    for entry in dic:
        print dic[entry]

def main():
    lis=["debitcard","elvis","silent","badcredit","lives","freedom","listen","levis","money"]
    anagroup(lis)

if __name__ == '__main__':
    main()
