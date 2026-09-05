import java.util.*;
public class isPrime {

    public static boolean isprime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int l=sc.nextInt();
        int r=sc.nextInt();


        for(int i=l;i<r;i++){
            if(isprime(i)){
                System.out.println(i + "");
            }
        }

    }
}
