class BST {

	bstNode head;

	public BST() {
		head= new bstNode();
		head= null;
	}

	public void insert(int x) {	
		insert(head, x);
	}

	public void insert(bstNode h,int x) {
		if (h== null) {
			h.data= x;
			return;
		}
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
		if(h!= null) System.out.print(h.data+" ");
		inOrderDisplay(h.left);
		inOrderDisplay(h.right);
	}
}