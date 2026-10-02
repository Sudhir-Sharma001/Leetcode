package Array;
import java.util.Scanner;
public class Secondlarge {
    public static void main(String[] args) {
        int []arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.print("Enter Element:");
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for (int i = 1; i <5 ; i++) {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }
        int smax=Integer.MIN_VALUE;
        for (int i = 1; i <5 ; i++) {
                if (smax<arr[i]&&max!=arr[i])
                {
                    smax=arr[i];
                }
        }
        System.out.println("Maximum is:"+max);
        System.out.println("Second Maximum is:"+smax);
    }
}
