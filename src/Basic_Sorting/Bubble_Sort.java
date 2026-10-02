package Basic_Sorting;

public class Bubble_Sort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr={3,5,-2,1,4,2,0};
        int swap=0;
        int n=arr.length;
        print(arr);
//        for (int j=0;j<n-1;j++)
//        {
//            for(int i=0;i<n-1-j;i+=1){
//                if(arr[i]>arr[i+1]){
//                    int temp=arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }
        //optimized solution for bubble sort
        for (int j=0;j<n-1;j++)
        {
//            boolean isSorted =true;
//            for(int i=0;i<n-1;i+=1){
//                if(arr[i]>arr[i+1]){
//                    isSorted=false;
//                    break;
//
//                }
//            }
//            if (isSorted)break;

            for(int i=0;i<n-1-j;i+=1){
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swap++;
                }
            }
            if ((swap==0))break;

        }
//        System.out.println("After Bubble sort:");
//        for (int j : arr) {
//            System.out.print(j+" ");
//        }
        print(arr);
        System.out.print(swap);
    }
}
