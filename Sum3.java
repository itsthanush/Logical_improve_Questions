import java.util.*;
public class Sum3 {
    public static void main(String[] args){

        int[] nums={-4,-2,-1,-1,0,1,2,3,5};

        for(int i=0;i<nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;

            int sum=0;
            while(left<right){
                sum = nums[i] + nums[left] + nums[right];
                if(sum==0)System.out.println(
                        nums[i] + ", " + nums[left] + ", " + nums[right]
                );
                left++;
                right--;
            }

            if(sum<0){
                left++;
            }
            else{
                right--;
            }

        }

    }
}
