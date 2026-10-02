package Array;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("Before swaping the value of a:"+a+" And b:"+b);
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.print("After swaping the value of a:"+a+" And b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After swaping the value of a:"+a+" And b:"+b);
    }
}
