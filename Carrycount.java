import java.util.*;
public class Carrycount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int count=0;
        int carry=0;
        int sum=0;

        while(num1!=0 || num2!=0){
            num1=num1 % 10;
            num2=num2 % 10;
            sum= carry +num1 + num2;

            if(sum>9){
                carry++;
                count++;
            }
            else{
                carry--;
            }

            num1=num1 / 10;
            num2=num2 / 10;
        }
        System.out.print(count);

    }
}
