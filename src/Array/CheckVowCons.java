package Array;

import java.util.Scanner;

public class CheckVowCons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a charecter or String:");
        char c=sc.next().charAt(0);

//      c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println(c+" is vowel");
        }
        else {
            System.out.println(c+" is Consonent");
        }
    }
}
