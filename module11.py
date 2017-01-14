class TreeNode(object):
    def __init__(self):
        self.data=0
        self.left= None
        self.right= None

class Tree(object):
    def __init__(self):
        self.root= TreeNode()

    def getRoot(self):
        return self.root

def main():
    t= Tree()
    root= t.getRoot()
    root.data= 10
    temp= TreeNode()





if __name__ == '__main__':
    main()
