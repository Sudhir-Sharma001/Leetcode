package Array;
import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int sum=0;
        int arr[]={1,2,3,9,4,5,5,5};
        for(int ele:arr){
            sum=sum+ele;
        }
        System.out.print(sum);
    }
}
