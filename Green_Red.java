//Red Pen Green Pen
//Problem: You are a teacher creating an engaging math activity for your students by writing N numbers on the classroom whiteboard. You use a green pen for odd numbers and a red pen for even numbers. Your task is to find and return an integer value representing the number of times you need to switch from the green pen to the red pen while writing these numbers.
//
//Input Specification:
//
//input1: An integer value N
//input2: An integer array representing the numbers to be written
//Output Specification: Return an integer value representing the number of times you need to switch from the green pen to the red pen while writing these numbers.
//
//        Example 1:
//
//input1: 5
//Input2: (1,2,1,6,10,9)
//Output: 2
//Explanation: The given sequence which he has to write is 1->2->1->6->10->9 Below is the sequence of pen, the teacher has to use:

import java.util.*;
public class Green_Red {
    public static void main(String[] args){

        int[] arr={1,2,1,6,10,9};
        int count=0;

        for(int i=1;i<arr.length;i++){
            //.  odd element     -->     even element  --> transition means increment the count
            if(arr[i - 1] % 2 !=0 && arr[i] % 2==0){
                count++;
            }
        }

        System.out.print(count);

    }
}
