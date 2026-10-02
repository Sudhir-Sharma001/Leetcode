package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr={35,46,58,5,2,9};
        int i=0;
        int n=arr.length;
        int j=n-1;
        while (i<j)
        {
          int temp  =arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print("\t"+arr[k]);

        }
    }
}
