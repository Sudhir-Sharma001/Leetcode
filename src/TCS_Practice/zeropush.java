package TCS_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class zeropush {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for (int i = 0; i < n; i++) {
            A[i]= sc.nextInt();
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            if(A[i]!=0){
                arr.add(A[i]);
            }
        }
        for (int i = arr.size(); i <n ; i++) {
            arr.add(0);
        }
        System.out.println(arr);
    }
}
