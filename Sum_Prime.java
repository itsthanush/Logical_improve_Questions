import java.util.*;
public class Sum_Prime {
    public static void main(String[] args){

        int prime=12;
        int sum=0;

        for(int i=2;i<=prime;i++){
            while(prime % i ==0){
                sum+=i;
                prime/=i;
            }
        }
        System.out.print(sum);

    }
}
