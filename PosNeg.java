import java.util.*;
public class PosNeg {
    public static void main(String[] args){
        int[] nums={-1,-2,3,4,-5,-6,7,8};

        int negCount=0;
        int posCount=0;

        int i=0;
        while(i<nums.length){
            if(nums[i] <0){
                i++;
            }
            else{
                negCount++;
            }

            if (nums[i] >0) {
                i++;
            }
            else{
                posCount++;
            }
        }

        System.out.println("Negative segments:"+negCount);
        System.out.println("Non-negative segments:" +posCount);
    }
}
