
//Finding the odd missing number from the array

import java.util.*;
public class OddMissingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();//4
        int[] arr=new int[n];//{1,3,7,9}

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int missing_val=0;

        for(int i=0;i<n - 1;i++){
            int curr_val=arr[i];

            if(arr[i + 1] - curr_val!=2){
                missing_val=curr_val + 2;
                break;
            }
        }


        System.out.print(missing_val);
    }
}
