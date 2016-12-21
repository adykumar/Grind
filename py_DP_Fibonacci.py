# DP Fibonacci


temp=0; temp2=0
def fibo(n):
    global temp
    global temp2
    temp=temp2
    if n==0: return 0
    if n==1: return 1
    if temp==0:
        temp= fibo(n-2)
        return temp+ fibo(n-1)
    temp2= fibo(n-2)
    return temp+temp2

def main():
    n= 7
    print fibo(n)

if __name__ == '__main__':
    main()
