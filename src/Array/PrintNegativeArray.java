package Array;

import java.util.Scanner;

public class PrintNegativeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int []arr=new int[n];
        System.out.print("Enter the element of array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("the elements of array:");
        for (int i = 0; i < n; i++) {
            if(arr[i]<0)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
