package Basic_Sorting;

public class ZeroesEnd {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr={3,5,0,-2,0,1,4,2,0};
        int n=arr.length;
        print(arr);
        int l=0,h=n-1;
        int count=0;
        for (int j=0;j<n-1;j++)
        {
            for(int i=0;i<n-1-j;i+=1){
                if(arr[i]==0){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }
            }
        }
        print(arr);
    }
}
