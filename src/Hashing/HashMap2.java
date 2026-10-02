package Hashing;
import java.util.*;
public class HashMap2 {
    public static void main(String[] args) {
        //country(key) ,population
     HashMap<String,Integer> map=new HashMap<>();
    //insertion
        map.put("India",120);
        map.put("USA",100);
        map.put("China",220);
        map.put("Russia",110);
        //printing
        System.out.println(map);

        //search
        if(map.containsKey("India")){
            System.out.println("Present");
        }
        else {
            System.out.println("not present");

        }
        System.out.println(map.get("China"));
        System.out.println(map.get("chin"));

        //Itration
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getValue()+" ");
            System.out.println(e.getKey()+" ");
        }

        //Traversal using keyset
        Set<String> keys=map.keySet();
        for (String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        //remove
        map.remove("China");
        System.out.println(map);
    }
}
