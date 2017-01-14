#-------------------------------------------------------------------------------
# Name:        module8
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     19/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def m(s):
    print "aaaa".split("b")
    s=unicode(s)
    if s[1:len(s)-1].count("e")==1:
            idx= s.index('e')
            print idx
            if s[idx+1:].isnumeric() == False: return False
            s= s.replace("e","")
    if s.isnumeric(): return True
    return False
def main():
    s="6e6.5"
    print m(s)

if __name__ == '__main__':
    main()
