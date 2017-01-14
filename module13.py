#-------------------------------------------------------------------------------
# Name:        module13
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     26/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
dic={}
def combo(plays, score):
    if score<=0: return 0
    for play in plays:
        return 1+ combo(plays,score-play)

def main():
    plays=[2,3,7]
    finscore= 12
    print combo(plays, finscore)

if __name__ == '__main__':
    main()
