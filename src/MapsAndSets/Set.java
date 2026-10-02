package MapsAndSets;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(22);set.add(23);set.add(24);set.add(25);set.add(26);
        System.out.println(set.size());
        System.out.println(set);
    }
}
