package PatternPrinting;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Row=sc.nextInt();
        int colm=sc.nextInt();
        for (int i=1;i<=Row;i++){
            for (int j=1;j<=colm;j++){
                System.out.println("1 2 3 4");
            }
            System.out.println();
        }
    }
}
