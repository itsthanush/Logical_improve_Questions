import java.util.*;
public class Valid_Palindrome {
    public static void main(String[] args){

        String s="A man, a plan, a canal: Panama";

        String clean_s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left=0;
        int right= clean_s.length() - 1;

        if(s  == null){
            System.out.print("True");
        }

        boolean palindrome=true;
        while(left<right){
            char[] ch=clean_s.toCharArray();
            if(ch[left] !=ch[right]){
                palindrome=false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(clean_s);
        if(palindrome){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
