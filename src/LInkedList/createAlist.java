package LInkedList;
 class node{
     int val;
     node next;
 }
 class Display{
     public static void displayRec(node head){
         if(head==null) return;

         displayRec(head.next);
         System.out.print(head.val+" ");
     }
 }
public class createAlist {
    public static void main(String[] args) {
        //23,22,21,20,24
        node n=new node();n.val=23;
        node a=new node();a.val=22;
        node b=new node();b.val=21;
        node c=new node();c.val=20;
        node d=new node();d.val=24;
//        //Conect karte hai ek node se dusre node ko
        n.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.next);
//        System.out.println(c);
//        System.out.println(b.next.next);
//        System.out.println(d);
        Display.displayRec(n);
    }
}
