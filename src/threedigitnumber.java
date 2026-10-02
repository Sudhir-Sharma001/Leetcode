import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= sc.nextInt();
        if (n>99 &&  n<1000){
            System.out.println("The input number is a Three digit number");
        }
        else {
            System.out.println("NOt a Three digit Number");
        }

    }
}
