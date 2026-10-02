package Array;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Height of triangle:");
        int height=sc.nextInt();
        System.out.println("Enter Base of triangle:");
        int base=sc.nextInt();
        int Area=(height*base)/2;
        System.out.print("Area of Triangle is"+Area);
    }
}
