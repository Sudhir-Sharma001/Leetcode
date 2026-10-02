package ProblemsEPAM;
import java.util.HashMap;
import java.util.Scanner;
public class countMIncharinString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an String:");
        String str=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        int min=Integer.MAX_VALUE;
        for(int value: hm.values()){
            if(value<min){
                min=value;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(hm.get(ch)==min){
                System.out.println(ch+" " + hm.get(ch));
                break;
            }
        }
    }
}
