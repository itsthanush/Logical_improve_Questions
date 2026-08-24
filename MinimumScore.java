import java.util.*;
public class MinimumScore {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String s=sc.next();

        int total=0;
        for(char ch:s.toCharArray()){
            total=total + ch - '0';
        }

        char[] stack=s.toCharArray();

        Arrays.sort(stack);

        int score=0;

        for(int i=n - 1;i>=0;i--){
            score=score + total;
            total=total - (stack[i] - '0');
        }

        System.out.print(score);
    }
}
