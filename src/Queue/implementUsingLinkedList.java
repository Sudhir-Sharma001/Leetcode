package Queue;

public class implementUsingLinkedList {
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        q.add(25);
        q.add(23);
        q.add(34);
        q.remove();
        q.add(45);
        int r=q.peek();
        q.display();
        System.out.println(q);
        System.out.println(r);
        System.out.println(q.size);
    }
}
