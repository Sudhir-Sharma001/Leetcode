import java.util.Scanner;
public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of lenght");
        int l=sc.nextInt();
        System.out.println("Enter the value of wiedth");
        int w= sc.nextInt();
        int Area =l*w;
        System.out.println("Area of rectangle is :" +Area);
        int Perimeter =l+w;
        Perimeter=Perimeter*2;
        System.out.println("Perimeter is :" +Perimeter);
        if (Perimeter>Area){
            System.out.println("Perimeter is grater than Area");
        }
        else
        {
            System.out.println("Area is greater than the perimeter ");
        }




    }

}
