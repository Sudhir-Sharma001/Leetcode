package MapsAndSets;

import java.util.HashMap;

public class MostfrequentCh {
    public int getMaxOccuringChar(int[] s) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < s.length; i++) {
            int ch = s[i];
            if (map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            }
            else map.put(ch, 1);
        }
        int Maxf=0;
        for(int ele: map.keySet()){
            int f=map.get(ele);
            if(f>Maxf) Maxf=f;
        }
        int n=s[0];
        for(int ele: map.keySet()){
            int f=map.get(ele);
            if(f==Maxf){
                n=ele;
            }
        }
        return  n;
    }
}
