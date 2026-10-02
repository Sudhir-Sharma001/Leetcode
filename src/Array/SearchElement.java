package Array;

public class SearchElement {
    public static void main(String[] args) {
        int []arr={10,12,13,14,2,3,4,5};
        int a=3;
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a){
                index=i;
                break;
            }

        }
        if (index != -1){
            System.out.println("Element : "+a+" found index at: "+index);
        }
        else {
            System.out.println("Element : "+a +" not found in that array: ");
        }

    }
}
