//### 1: Half Sum Array
//
//Write a program that checks whether the sum of the first half of an array is less than the sum of the second half.
// If this condition is met,
//the program should reverse the entire array. Finally,
//the program should print the resulting array.

import java.util.*;
public class Half_sum {

    //using 2 pointers we can swap or reverse the array 
    public static int[] reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }


    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6};
        int half=arr.length / 2;

        int first_half_sum=0;
        int sec_half_sum=0;

        for(int i=0;i<half;i++){
            first_half_sum+=arr[i];
        }
        for(int i=half;i<arr.length;i++){
            sec_half_sum+=arr[i];
        }


        if(first_half_sum < sec_half_sum){
            reverse(arr);
            System.out.print((Arrays.toString(arr)));
        }



    }
}
