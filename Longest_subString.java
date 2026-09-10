import java.util.*;
public class Longest_subString {
    public static void main(String[] args){

        String s="pwwkewxpw";

        int maxLen=0;
        int left=0;

        HashSet<Character> set=new HashSet<>();

        for(int right=0;right<s.length();right++){


            //check is the element already present in it or not
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(right));
                left++;
            }

            //if the char is not there in set and also check the length of the substring:
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen,right - left + 1);


        }
        System.out.print(maxLen);

    }
}
