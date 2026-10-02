package BinaryTree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class Implementation {
    public static void main(String[] args) {
        Node a=new Node(11);
        Node b=new Node(-1);
        Node c=new Node(2);
        Node d=new Node(3);
        Node e=new Node(4);
        Node f=new Node(5);
        Node g=new Node(45);
        a.left=b; a.right=c;
        b.left=d;b.right=e;
        c.left=f; c.right=g;
        display(a);
        System.out.println();
        System.out.println("Sum is="+sum(a));
        System.out.println("Maximum value is="+ max(a));
        System.out.println("Minimum value is="+ min(a));
    }
    private static int  sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);

    }
    private static int  max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));

    }
    private static int  min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));

    }

    private static void display(Node root) {
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

}
