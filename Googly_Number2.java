import java.util.*;
public class Googly_Number2 {

    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        for(int i=2;i * i <=n;i++){
            if(n % i==0){
                return false;
            }
        }

        return true;

    }


    public static void main(String[] args){
        String s="43";
        int sum=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int digit=ch - '0';
            sum=sum + digit;
        }

        if(isPrime(sum)){
            System.out.print("it is an Googly number");
        }
        else{
            System.out.print("it is Not an Googly Number");
        }
    }
}
