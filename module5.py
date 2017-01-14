class Solution(object):

    def depthsum1(self,lis,dep,sum):
        for entry in lis:
            a=0;b=0;
            if type(entry) is int: sum=sum+ (entry*dep)
            else: sum= self.depthsum1(entry,dep+1,sum)
        return sum

    def depthSum(self, nestedList):
        """
        :type nestedList: List[NestedInteger]
        :rtype: int
        """
        a=self.depthsum1(nestedList,1,0)
        return a

def main():
    obj=Solution()
    print obj.depthSum([1,[4,[6]]])
    #print obj.depthSum([[1,1],2,[1,1]])

if __name__ == '__main__':
    main()