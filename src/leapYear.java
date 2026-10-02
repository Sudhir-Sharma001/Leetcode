import java.util.Scanner;
public class leapYear {
    public static void main(String[]args){
        int year;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Year");
        year= sc.nextInt();
        // Correct logic for leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap Year");

        }
        else
        {
            System.out.println("Not Leap Year");
        }

    }
}
