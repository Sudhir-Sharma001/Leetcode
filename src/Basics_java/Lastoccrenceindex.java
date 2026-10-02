package Basics_java;

import java.util.HashMap;

public class Lastoccrenceindex {
    public static void main(String[] args) {
        int arr[]={1,5,5,1,2,5,9,9,10};
        HashMap <Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int ch=arr[i];
            if(hm.containsKey(ch)){
              hm.put(ch,hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }

        }

    }
}
