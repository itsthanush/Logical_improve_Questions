import java.util.*;
public class SquareOfLast_digit {
    public static void main(String[] args){


        int n=15;
        int d=6;


        int count=0;
        for(int i=1;i<=n;i++){
            int square=i * i;
            int digit=0;

            //for finding the last digit

            digit+=square %10;
            square/=10;

            if(digit == d){
                count++;
            }
        }

        System.out.print(count);

    }
}
