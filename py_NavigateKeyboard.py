# Controller: u, d, l, r, ! (select)
# Keyboard: width, alphabet
# w = 5, A = [a-z]
# a b c d e
# f g h i j
# k l m n o
# o q r s t
# u v w x y
# z
# ------------------------------------
# dog => r3!d2r1!u1l3!
# abc => !r1!r1!
# ry => r2d3!r2d1!
# zw => d5!r2u1! (incorrect), d5!u1r2! (correct)

def nav(dic,src,dst,w):
    print src,dst,"=>",
    c1= dic[src]; c2= dic[dst]

    if c1==c2: print "!"
    d=0; u=0; l=0; r=0


    if c1[1]<c2[1]:
        r= c2[1]-c1[1]
    elif c1[1]>c2[1]:
        l= c1[1]-c2[1]


    if c1[0]<c2[0]:
        d= c2[0]-c1[0]
    elif c1[0]>c2[0]:
        u= c1[0]-c2[0]

    return [d,u,l,r]

def prnt(arr):
    d=arr[0];u=arr[1];l=arr[2];r=arr[3];
    if u!=0:
        print "u",u,"!",
    if l!=0:
        print "l",l,"!",
    if r!=0:
        print "r",r,"!",
    if d!=0:
        print "d",d,"!",
    print

def main():
    alpha= "abcdefghijklmnopqrstuvwxyz"
    word="zombie"
    dic={}
    width=5
    c=0
    lastrow= len(alpha)/width
    for each in alpha:
        dic[each]= [c/5,c%5]
        c=c+1
    prnt(nav(dic,'a',word[0],width))
    for i in range(1,len(word)):
        prnt(nav(dic,word[i-1],word[i],width))

if __name__ == '__main__':
    main()
