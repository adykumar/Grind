#-------------------------------------------------------------------------------
# Name:        module17
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     11/01/2017
# Copyright:   (c) Swadhyaya 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------
class TrieNode(object):
    def __init__(self):
        self.map={}
        self.eow= False

class Trie(object):
    def __init__(self):
        self.head= TrieNode()

    def add_word(self, word):
        current = self.head
        for i in word:
            if i in current.map:
                current= current.map[i]
            else:
                current.map[i]= TrieNode()
                current=current.map[i]
        current.eow= True

    def check_word(self, word):
        current= self.head
        for i in word:
            if i not in current.map: return False
            current= current.map[i]
        return current.eow

    def check_prefix(self, word):
        if word=="": return False
        current= self.head
        for i in word:
            if i not in current.map: return False
            current= current.map[i]
        return True


def check2(tr, word):
    print 11
    current= tr.head
    for i in range(len(word)-1):
        a= word[i]
        if a in current.map:

            if current.map[a].eow== True and tr.check_word(word[i+1:len(word)]):
                print word[0:i+1],word[i+1:len(word)]
                return True
            current=current.map[a]
        else: return False
    return False


def main():
    mytrie= Trie()
    mytrie.add_word("fal")
    mytrie.add_word("fall")
    mytrie.add_word("tootsie")
    mytrie.add_word("roll")

    print check2(mytrie,"tootsieroll")

if __name__ == '__main__':
    main()
