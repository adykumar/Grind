import random
import datetime

chaplist={}
last10=[]
def select3(chaplist,n):
    dt= datetime.datetime.now()
    dt= str(dt)
    fin= open("d:\\LastDone.txt","r")
    lines= fin.readlines()
    fin.close()
    fout= open("d:\\LastDone.txt","a")
    for last in lines[-15:]:
        last10.append(last.split()[0])
    while(n>0):
        x= random.choice(chaplist.keys())
        if x not in last10:
            last10.append(x)
            print x,chaplist[x]
            n=n-1
            fout.write(x+"  "+chaplist[x]+"  ")
            if n==2: fout.write(dt+"\n")
            else: fout.write("\n")
    fout.close()

def main():
    fin= open("d:\\CodingChapters.txt","r")
    all= fin.readlines()
    for line in all:
        part= line.split()
        try: chaplist[part[0]]=part[1]
        except: pass

    select3(chaplist,3) #<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    return

if __name__ == '__main__':
    main()
