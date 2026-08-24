import java.util.*;
public class EquilibriumPoint1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String s=sc.next();

        int total=0;
        //find total value of all char
        for(int i=0;i<s.length();i++){
             total=total + s.charAt(i) - 'a' + 1;
        }

        int left=0;
        for(int i=0;i<s.length();i++){
            int curr=s.charAt(i) - 'a' + 1;
            int right=total - left - curr;

            if(left==right){
                System.out.print(i);
            }

            left+=curr;
        }


    }
}
