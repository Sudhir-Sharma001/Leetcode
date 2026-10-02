package Methods;

import java.util.Scanner;

public class MaxofThreeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the four valuse a,b,c,d=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d= sc.nextInt();
        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
    }
}
