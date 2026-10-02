package ProblemsEPAM;

import Strings.StringBuilders;

import java.util.HashSet;
import java.util.Scanner;

public class UniqString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an String:");
        String str=sc.nextLine();
        str.toLowerCase();
        HashSet<String> set=new HashSet<>();
        String []words=str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String s=words[i];
            set.add(s);
        }
//        StringBuilders sb=new StringBuilders();
        for (String s:set){
            System.out.println(s);
        }
        System.out.println("Total number of uniqe word");
        System.out.print(set.size());
    }
}
