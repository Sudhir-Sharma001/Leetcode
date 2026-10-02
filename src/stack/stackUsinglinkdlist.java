package stack;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
class MyStack{
    node head;
    int len;
    int peek(){
        if(head==null){
            System.out.println("Stack is Underflow");
        }
        return head.val;
    }
    int pop(){
        if(head==null){
            System.out.println("Stack is Underflow");
        }
        int x=head.val;
        head=head.next;
        len--;
        return x;
    }
    int push(int ele){
        node temp=new node(ele);
        temp.next=head;
        head=temp;
        return -1;
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println();
    }
}
public class stackUsinglinkdlist {
    public static void main(String[] args) {
    MyStack st=new MyStack();
    st.push(45);
    st.push(10);
    st.push(3);
        st.push(31);
        st.pop();
    st.display();
        System.out.println(st.peek());
    }
}
