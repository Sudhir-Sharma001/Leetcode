import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        int cp,sp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Cost Price");
        cp=sc.nextInt();
        System.out.println("Enter The Selling Price");
        sp=sc.nextInt();
        if (sp>cp){
            System.out.print("Profit : ");
            System.out.println(sp-cp);
        }
        else {
            System.out.print("Loss : ");
            System.out.println(cp-sp);
        }

        
    }
}
