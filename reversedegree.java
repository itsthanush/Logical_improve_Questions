import java.util.*;
public class reversedegree {
    public static void main(String[] args){

        String s="abc";

        int sum=0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            int reverseIndex = (char) ('z' - ch + 1);
            int position=i + 1;
            sum+=reverseIndex * position;
        }

        System.out.print(sum);

    }
}
