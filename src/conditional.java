import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;

public class conditional    {
    public static void main(String[]args){
        int a;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Positive integer");
        a=sc.nextInt();
        if (a%5==0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }

    }
}