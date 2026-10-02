import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        if(a>b){
            System.out.println("a is gratter");
        }
        else {
            System.out.println("b is grater");
        }
        int reminder =a%b;
        System.out.println("Reminder of the both inout when we apply the module function   "  + reminder);

    }
}