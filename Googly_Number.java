//A Googly Prime Number (often used as a coding interview problem) is a number where the sum of its individual digits adds up to a prime number.
public class Googly_Number {

    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        for(int i=2;i * i <=n;i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        int n=45;
        int sum=0;


        //for integer input:
       while(n>0){
           int digit=n % 10;
           sum=sum + digit;
           n=n / 10;
       }

       if(isPrime(sum)){
           System.out.print("It is an googly number");
       }else {
           System.out.print("It is not an googly number");
       }


    }
}
