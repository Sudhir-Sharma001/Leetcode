package BinnarySearch;

public class NOTInArrayEl {
    public static void main(String[] args) {
        int arr[]={2,3,7,20,21,23};
        int target=24;
        int l=0,r=arr.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            } else if (arr[mid]<target) {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        System.out.println(l);
    }
}
