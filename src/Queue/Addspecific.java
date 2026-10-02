package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Addspecific {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(20);q.add(30);q.add(40);q.add(50);q.add(60);
        int n=q.size();
        int p=3;
        int ele=800;
        for (int i = 0; i < p; i++) {
            q.add(q.remove());
        }
        q.add(ele);
        for (int i = 0; i < n-p; i++) {
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
