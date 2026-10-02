package Methods;

import java.util.Scanner;

public class swapTwonumber {
    //using thir Variable
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a and b after swaping A="+a+"B="+b);
    }


}
