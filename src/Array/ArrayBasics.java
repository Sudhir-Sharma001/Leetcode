package Array;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
//      int[] x={6,19,7,69,9,171,5};
      int [] arr =new int[6];
      //indexing
//        System.out.println(x[5]);
//        x[3]=35;
//        System.out.println(x[3]);
//        arr[0]=13;
//        arr[1]=16;
//        arr[2]=14;
//        arr[3]=133;
//        arr[4]=18;
//        arr[5]=19;
        for(int i =0;i<6;i++){
          arr[i]=sc.nextInt();
        }
        for(int i =0;i<6;i++){
          System.out.println("Array elements are:="+arr[i]);

        }
    }

}
