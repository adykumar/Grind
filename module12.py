class WordDistance(object):
    dic={}
    def __init__(self, words):
        """
        initialize your data structure here.
        :type words: List[str]
        """
        i=0
        for each in words:
           if each in self.dic: self.dic[each].append(i)
           else:
               self.dic[each]=[]
               self.dic[each].append(i)
           i=i+1


    def shortest(self, word1, word2):
        """
        Adds a word into the data structure.
        :type word1: str
        :type word2: str
        :rtype: int
        """
        arr1= self.dic[word1]; i=0;
        arr2= self.dic[word2]; j=0;
        min= max(arr1[-1],arr2[-1])
        while i<len(arr1) and j<len(arr2):
            print i,j,"-"
            if min> abs(arr1[i]-arr2[j]):
                min= abs(arr1[i]-arr2[j])
            if arr1[i]<= arr2[j]:
                i=i+1
            else: j=j+1
        print arr1, arr2
        return min

def main():
    words= ["a","c","b","a"]
    wordDistance = WordDistance(words)
    print wordDistance.shortest("a", "b")
    print wordDistance.shortest("b", "a")
if __name__ == '__main__':
    main()


# Your WordDistance object will be instantiated and called as such:
# wordDistance = WordDistance(words)
# wordDistance.shortest("word1", "word2")
# wordDistance.shortest("anotherWord1", "anotherWord2")