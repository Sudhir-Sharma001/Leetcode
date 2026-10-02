package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basic {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(20);q.add(30);q.add(40);q.add(50);q.add(60);
        System.out.println(q.size());
        System.out.println(q);
        int n=q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek()+" ");
            q.add(q.remove());
//            q.remove();

        }
        System.out.println(q);


    }
}
