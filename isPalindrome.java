import java.util.*;
public class isPalindrome {

    public static  boolean isPalindrome(int num){

        if(num <0){
            return  false;
        }
        int reversed=0;
        int original=num;
        while(num>0){
            int remainder=num %10;
            reversed=(reversed * 10) + remainder;
            num=num /10;
        }
        return original == reversed;
    }


    public static void main(String[] args){
        int l=100;
        int r=200;

        for(int i=l;i<r;i++){
            if(isPalindrome(i)){
                System.out.print(i + " ");
            }
        }



    }
}
