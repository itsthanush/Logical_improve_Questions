import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int left = 0;
        int right = s.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
    }
}