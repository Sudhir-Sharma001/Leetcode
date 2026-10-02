package BinnarySearch;

public class firstPprogram {
    public static int main(String[] args) {
        int arr[]={2,3,7,20,21};
        int target=5;
        int l=0,r=arr.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return -1;
    }

}
