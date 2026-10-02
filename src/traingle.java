import java.util.Scanner;
public class traingle {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First value ");
        a=sc.nextInt();
        System.out.println("Enter the Second value ");
        b=sc.nextInt();
        System.out.println("Enter the Third value ");
        c=sc.nextInt();
        if (a+b>c&&b+c>a&&c+a>b){
            System.out.println("They can be side of tringle");
        }
        else
            System.out.println("not the side of tringle");

    }
}
