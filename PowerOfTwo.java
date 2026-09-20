import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args){


       int n=15;

       while(n!=1){
           if(n%2!=0){
               System.out.print("False");
           }
           else{
               n=n/2;
           }
       }

        System.out.print("True");

    }
}
