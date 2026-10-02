package Array;

public class TwoSum {
    public static void main(String[] args) {
        int []arr={1,2,-3,-1,4,5};
        System.out.println("Two Sum");
        twoSum(arr,2);
    }
    public static boolean twoSum(int arr[], int target) {

            // code here
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]+arr[j]==target)
                        return true;
                }
            }
            return false;


    }
}
