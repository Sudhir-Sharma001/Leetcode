package MapsAndSets;

import java.util.HashMap;

public class Mps_SLT {
    public static void main(String[] args) {
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("Sudhir",20);
        hm.put("Sudhir Sharma",21);
        hm.put("Sudhir Kumar",19);
        hm.put("Sudhir ji",22 );
        for(String key: hm.keySet()){
            System.out.println(key+" "+hm.get(key));
        }
//        System.out.println(hm);
//        System.out.println(hm.get("Sudhir"));
//        System.out.println(hm.containsKey("Sudhir k"));
//        System.out.println(hm.size());
//        System.out.println(hm.remove("Sudhir"));
//        System.out.println(hm);
    }
}
