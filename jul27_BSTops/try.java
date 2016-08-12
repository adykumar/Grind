class tryy{
  public static void main(String args[]) {
    bstNode node= new bstNode();
    node.data= 10;
    bstNode node2= new bstNode();
    node.left= node2;
    node2.data= 20;
    bstNode head= new bstNode();
    head= null;
    System.out.println(head);
    if (head==null) System.out.println("null head");
    System.out.println(node.left.data);
  }
}
