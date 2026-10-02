package BinnarySearch;

public class LeftmostBS {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3,4,5,6};
        int l=0;
        int r=arr.length-1;
        int target=1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                ans=mid;
//              r=mid-1;
                l=mid+1;
            } else if (arr[mid]>target) {

                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        System.out.println(ans);

    }
}
