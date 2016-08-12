class BST {

	bstNode head= new bstNode();
	public BST() {
		head= null;
	}

	public void insert(int x) {
		if(head==null) head.data=10;
		//else insert(head, x);
		if (head==null) System.out.println(head);
	}

	public void insert(bstNode h,int x) {
		if (x >= h.data) {

			if (h.right== null) {
				bstNode temp= new bstNode();
				temp.data= x;
				h.right= temp;
				return;
			}
			insert(h.right, x);
		}
		else {
			if (h.left== null) {
				bstNode temp= new bstNode();
				temp.data= x;
				h.left= temp;
				return;
			}
			insert(h.left,x);
		}
	}
	public void inOrderDisplay(bstNode h) {
		System.out.print(h.data+" ");
		//inOrderDisplay(h.left);
		//inOrderDisplay(h.right);
	}
}
