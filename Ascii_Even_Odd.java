import java.util.*;
public class Ascii_Even_Odd {
    public static void main(String[] args){
        String s="abcd";
        int even_sum=0;
        int odd_sum=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            int val=(int)(ch);
            if(val % 2==0){
                even_sum+=val;
            }
            else{
                odd_sum+=val;
            }
        }
        System.out.println("Even sum="+even_sum);
        System.out.println("Odd_sum="+odd_sum);


    }
}
