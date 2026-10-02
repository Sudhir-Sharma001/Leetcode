import java.util.ArrayList;

public class ArrayRotate {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        int j=0;
        for (int i =n-k; i<n; i++){
            list.add(j,nums[i]);
            j++;
        }
        for (int i =0; i<n-k; i++){
            list.add(j,nums[i]);
            j++;
        }
        for (int i =0; i<n-k; i++){
            nums[i]=list.get(i);
        }

    }
}
