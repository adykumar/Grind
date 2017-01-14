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
# COMPANY STRUCTURE TREE
# https://www.careercup.com/question?id=5754527530614784

def company(hmap):
    dic={}
    for key in hmap:
        if key not in dic: dic[key]=0
        else:
            for val in hmap[key]:
                if val in dic: dic[val]=dic[val]+1
                else: dic[val]=1
        for val in hmap[key]:
            if val in dic: dic[val]=dic[val]+1
            else: dic[val]=dic[key]+1
    print dic

def main():
    hmap={}
    hmap["aaa"]=["bbb","ccc","eee"]
    hmap["ccc"]=["ddd"]
    hmap["xx"]=["yy"]
    hmap["eee"]=["ff"]
    company(hmap)


if __name__ == '__main__':
    main()
