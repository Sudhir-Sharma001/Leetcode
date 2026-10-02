import java.util.Scanner;

public class ageGues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Ram ,Shyam,Shri;
        System.out.println("Enter the Ram age");
        Ram=sc.nextInt();
        System.out.println("Enter the Shyam age");
        Shyam=sc.nextInt();
        System.out.println("Enter the Shri age");
        Shri=sc.nextInt();
        if (Ram<Shyam){
            if (Ram<Shri){
                System.out.println("Ram is Younger then other");
            }

            else {
                System.out.println(" Shri is Younger");
            }
        }
        else {

            if (Shyam<Shri){
                System.out.println("Shyam is Younger");
            }
            else {
                System.out.println("shri is Younger");
            }
        }

    }
}
