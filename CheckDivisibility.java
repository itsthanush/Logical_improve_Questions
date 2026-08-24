//You are given a positive integer n. Determine whether n is divisible by the sum of the following two values:
//
//        The digit sum of n (the sum of its digits).
//
//        The digit product of n (the product of its digits).
//
//        Return true if n is divisible by this sum; otherwise, return false.
//Example 1:
//Input: n = 99
//
//        Output: true
//
//        Explanation:
//
//        Since 99 is divisible by the sum (9 + 9 = 18) plus product (9 * 9 = 81) of its digits (total 99), the output is true.
import java.util.*;
public class CheckDivisibility {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int n1=n;

        int sum=0;
        int prod=1;
        while(n>0){
            int digit=n % 10;
            sum=sum + digit;
            prod=prod * digit;
            n= n / 10;
        }
        System.out.println(sum);
        System.out.println(prod);

        int Total=(sum + prod) / n1;
        System.out.println(Total);
        if(Total==1){
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }

    }
}
