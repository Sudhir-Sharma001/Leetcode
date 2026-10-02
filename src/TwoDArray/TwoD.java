package TwoDArray;
import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        int[][] arr=new int [3][3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            for (int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}
