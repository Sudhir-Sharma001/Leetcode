package Array;

import java.util.Scanner;


public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.141;
        System.out.println("Enter the radius of circle:");
        double r= sc.nextDouble();
        double area=pi*r*r;
        System.out.print("SArea of circle is :"+area);
    }
}
