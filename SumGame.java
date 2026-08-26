//### LeetCode 1927 – Sum Game
//
//        You are given a string containing **digits (`0-9`) and `?`**.
//
//        The string always has an **even length**, so divide it into two equal halves.
//
//        Example:
//
//        ```text
//        s = "502?"
//        ```
//
//        Divide it:
//
//        ```text
//        50 | 2?
//        ```
//
//        There are two players:
//
//        * **Alice** replaces a `?` with a digit.
//        * **Bob** replaces the next `?` with a digit.
//        * They continue until there are no `?` left.
//
//        ### Goal
//
//        After all `?` are replaced:
//
//        * If the **sum of digits on the left ≠ sum of digits on the right**, **Alice wins**.
//        * If the **sum of digits on the left = sum of digits on the right**, **Bob wins**.
//
//        You need to determine:
//
//        > **Can Alice always win if both players play optimally?**
//
//        Return:
//
//        ```text
//        true  → Alice can guarantee a win
//        false → Bob can guarantee a win
//        ```
//
//        ### Simple example
//
//        ```text
//        s = "25??"
//        ```
//
//        Split:
//
//        ```text
//        25 | ??
//        ```
//
//        Left sum:
//
//        ```text
//        2 + 5 = 7
//        ```
//
//        Right side has two unknown digits.
//
//        Alice and Bob take turns choosing those digits. Alice can choose a value that prevents the two sums from becoming equal.
//
//        Therefore:
//
//        ```text
//        true
//        ```
//
//        **The important thing to understand:** this is not simply "check whether the current sums are different." The `?` can change the sums, and **both players choose their digits strategically**.

import java.util.*;
public class SumGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int mid = s.length() / 2;

        int left_sum = 0;
        int right_sum = 0;

        int leftq = 0;
        int rightq = 0;

        // Left half
        for (int i = 0; i < mid; i++) {
            char ch = s.charAt(i);

            if (ch == '?') {
                leftq++;
            } else {
                left_sum = left_sum + (ch - '0');
            }
        }

        // Right half
        for (int i = mid; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '?') {
                rightq++;
            } else {
                right_sum = right_sum + (ch - '0');
            }
        }

        int diff = left_sum - right_sum;
        int qdiff = leftq - rightq;

        if (qdiff == 0) {

            if (diff == 0) {
                System.out.println("False");
            } else {
                System.out.println("True");
            }

        } else {

            if (diff == -9 * (qdiff / 2)) {
                System.out.println("False");
            } else {
                System.out.println("True");
            }
        }
    }
}