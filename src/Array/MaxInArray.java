package Array;

public class MaxInArray {
    public static void main(String[] args) {
        int arr1[]={45,67,67,34,68,45};
        int max=arr1[0];
        int min=arr1[0];
        for (int i = 1; i < arr1.length ; i++) {
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        for (int i = 1; i < arr1.length ; i++) {
            if(arr1[i]<min){
                min=arr1[i];
            }
        }
        System.out.println("Maximum element is"+max);
        System.out.println("Minimum element is"+min);

    }
}
