import java.util.Scanner;

public class maxHeap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        buildmaxheap(arr,n);
        int idx=0;
        while (idx<n){
            System.out.print(arr[idx]+" ");
            idx=2*idx+1;
        }
    }

    private static void buildmaxheap(int[] arr, int n) {
        for (int i = n/2-1; i >=0 ; i--) {
            heapyfy(arr,n,i);

        }
    }

    private static void heapyfy(int[] arr, int n, int i) {
        int large=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n&&arr[l]>arr[large]) large=l;
        if(r<n&&arr[r]>arr[large]) large=r;
        if(large!=i){
            int temp=arr[i];
            arr[i]=arr[large];
            arr[large]=temp;
            heapyfy(arr,n,large);
        }
    }
}
