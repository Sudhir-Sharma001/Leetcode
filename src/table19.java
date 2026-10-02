import java.util.Scanner;

public class table19 {
    public static void main(String[] args) {
//        for (int i =19;i<=190;i++)
//        {
//            if (i%19==0){
//                System.out.println(i);
//            }
//        }
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i+=3){
            System.out.println(i);

        }
    }
}
