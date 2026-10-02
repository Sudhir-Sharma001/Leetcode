package LInkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

class LinkedList{
    Node head;
    Node tail;
    int size;

    int get(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid index");
            return -1;
        }
        Node temp=head;
        for (int i = 0; i < idx ; i++) {
            temp=temp.next;
        }
        return temp.val;
    }

    int search(int val){
        if(head==null) return -1;
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.val==val) return idx;
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null){
            head=tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            head=head.next;
            size--;
            if(head==null) tail=null;
        }
    }
    Node deleteAtEnd(){
        Node curr=head;
        if(curr.next==null){
            return null;
        }
        if(curr==null){
            return null;
        }
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    void delete(int idx){
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx<0||idx>size){
            System.out.println("Invalid Index");
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;//delete
        if(idx==size-1){
            tail=temp;//we are deleting tail
        }
        size--;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void insert(int val, int idx) {
        if(idx<0 || idx>size){
            System.out.println("Invalid index");
            return;
        }
        if(idx==0){
            addAtHead(val);
        }
        else if (idx==size){
            addAtTail(val);
        }
        else{
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();

        l1.deleteAtHead();

        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.addAtTail(23);
        l1.display();

        l1.addAtHead(100);
        l1.display();

        l1.deleteAtHead();
        l1.display();

        System.out.println(l1.search(23));

        l1.insert(47,4);
        l1.display();

        System.out.println(l1.get(1));

        l1.display();

        System.out.println("Size: "+l1.size);
        l1.deleteAtEnd();
        l1.display();
        l1.delete(3);
        l1.display();
    }
}
