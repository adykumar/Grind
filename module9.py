import heapq

def klongest(lis,n):
    minh=[]
    heapq.heapify(minh)
    for each in lis:
        l= len(each)
        if n==0 and l>len(minh[0]):
            heapq.heappop(minh)
            heapq.heappush(minh,each)
        if n>0:
            n=n-1
            heapq.heappush(minh,each)
    return minh

def main():
    lis=["abejs ffdfdsf","ba","jhbs","jhac s","jdshgvbsv","hjbk","jsbjdbf"]
    print klongest(lis,4)

if __name__ == '__main__':
    main()
