

public class reversearrR {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,5,5,6,6};
        int n=arr.length;
        reverse(arr,n,n-1);
    }

    private static void reverse(int[] arr, int n, int i) {
        if (i<0) return;
        System.out.print(arr[i]+" ");
        reverse(arr,n,i-1);
    }
}
