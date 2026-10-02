package Array;

public class sumofEleOfArray {
    public static void main(String[] args) {
        int arr1[]={45,67,67,34,68,45};
        int sum=0;
        int mul=1;
        for (int i = 0; i < arr1.length; i++) {
            sum=sum+ arr1[i];
            mul=mul* arr1[i];

        }
        System.out.println("Sum of element of Array:"+sum);
        System.out.println("Multiplication of element of Array:"+mul);
    }
}
