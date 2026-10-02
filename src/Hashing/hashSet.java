package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        //creation of Hash Map
        HashSet <Integer> set=new HashSet<>();
        //insert
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(3);
        //serch Using Contains
        if(set.contains(8))
        {
            System.out.println("Set contains1");
        }
        else
            System.out.println(" Not Contains");
        if(!set.contains(9))
        {
            System.out.println("Does not contain");
        }
        int b=set.size();
        System.out.println("Set size is:-"+b);
        //Delete element of Hashset
        set.remove(2);
        //print all element
        System.out.println(set);
        //size
        int a=set.size();
        System.out.println("Set size is:-"+a);
        //iterator
        Iterator it =set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }

    }
}
