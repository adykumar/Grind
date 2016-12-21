# NOT WORKING TRIE

class TrieNode(object):
    c=''
    children= {}
    endword= False
    def __init__(self,c=None):
        if c is not None: self.c=c

class Trie(object):
    root= TrieNode()

    def insert(self,word):
        children= root.children
        temp= TrieNode()
        for each in word:
            if each not in children:
                children[each]= temp
            else:
                temp= children[each]
            children= temp.children


    def search(self, word):

        t= self.root
        for each in word:
            if each not in t.children: return False
            else:
                t= t.children
        return t.endword


def main():
    t= Trie()
    t.insert("fail")
    t.insert("pass")
    t.insert("pas")
    print t.search("pass")

if __name__ == '__main__':
    main()
