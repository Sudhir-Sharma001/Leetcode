package Queue;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;

    }
}
public class MyQueue{
    Node head;
    Node tail;
    int size;
    int remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int front=head.val;
        head=head.next;
        size--;
        return front;
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.val;
    }
    void add(int x){
        Node temp=new Node(x);
        if(tail==null)head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void  display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
    }


}
