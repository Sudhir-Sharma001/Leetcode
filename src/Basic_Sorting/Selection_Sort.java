package Basic_Sorting;

public class Selection_Sort {
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
        for (int i = 0; i<n-1; i++) {
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for (int j = i;j<n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    mindx=j;

                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;



        }
        print(arr);
    }
}
