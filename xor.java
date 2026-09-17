import java.util.*;
public class xor {
    public static void main(String[] args){

        int[] nums={23,17,21,19,25,16,22,20,24};

        int min=nums[0];
        int max=nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max=nums[i];
            }
            if(nums[i] < min){
                min=nums[i];
            }
        }

        int xor1=0;
        int xor2=0;


        for(int i=min;i<=max;i++){
            xor1=xor1 ^ i;
        }
        for(int i=0;i<nums.length;i++){
            xor2=xor2 ^ nums[i];
        }

        int res=xor1 ^ xor2;

        System.out.print(res);

    }
}
