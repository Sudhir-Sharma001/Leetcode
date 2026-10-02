package MapsAndSets;

import java.util.HashMap;
//a[] = {11, 7, 1, 13, 21, 3, 7, 3};
//b[] = {11, 3, 7, 1, 7};
public class ArraysSubset {
    public boolean isSubset(int a[], int b[]) {

        HashMap<Integer,Integer> mapA=new HashMap<>();
        HashMap<Integer,Integer> mapB=new HashMap<>();
        for (int ele:a){
            if (mapA.containsKey(ele)) {
                int freq = mapA.get(ele);
                mapA.put(ele, freq + 1);
            }
            else mapA.put(ele, 1);
        }
        for (int ele:b){
            if(!mapA.containsKey(ele)) return false;
            if (mapB.containsKey(ele)) {
                int freq = mapB.get(ele);
                mapB.put(ele, freq + 1);
            }
            else mapB.put(ele, 1);
        }
        for (int key:mapB.keySet()){
            int bfreq=mapB.get(key);
            int afreq=mapB.get(key);
            if (afreq<bfreq) return false;

        }
        return true;
    }
}
