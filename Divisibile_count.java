//Coding Question
//
//        Given an integer N, calculate the running sum from 1 to N.
//
//        Whenever the running sum is divisible by 5, increase a counter by 1.
//
//        Finally, print the count.
//
//        Input
//        10
//        How it works
//
//        Running sums:
//
//        1       → not divisible by 5
//        1+2 = 3 → not divisible by 5
//        3+3 = 6
//        6+4 = 10 → divisible by 5 → count = 1
//        10+5 = 15 → divisible by 5 → count = 2
//        15+6 = 21
//        21+7 = 28
//        28+8 = 36
//        36+9 = 45 → divisible by 5 → count = 3
//        45+10 = 55 → divisible by 5 → count = 4
//        Output
//        4
import java.util.*;
public class Divisibile_count {
    public static void main(String[] args){

        int n=10;
        int sum=0;
        int count=0;

        for(int i=1;i<=n;i++){

            sum=sum + i;
            if(sum % 5 ==0){
                count++;
            }

        }
        System.out.print(count);
    }
}
