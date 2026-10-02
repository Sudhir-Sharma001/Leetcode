package Recursion;

import java.util.Scanner;



public class function_calling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printTable(n);
    }

    private static void printTable(int n) {
        if(n==0) return;

        printTable(n-1);
        System.out.println(n);
    }
}
