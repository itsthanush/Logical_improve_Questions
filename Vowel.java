import java.util.*;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s=sc.next();

        int count=0;
        for(char ch: s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }

        System.out.print(count);
    }
}