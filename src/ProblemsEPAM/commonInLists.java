package ProblemsEPAM;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class commonInLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        Collections.addAll(list1, 10,20,30,50,60,70);
        Collections.addAll(list2, 10,2,50,30,50,6,7,10);
        for(int num:list1) {
            if(list2.contains(num)) {
                list3.add(num);
            }
        }
        System.out.print("Common Element:");
        for(int num:list3) {
            System.out.print(num + " ");
        }
    }
}
