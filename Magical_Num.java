//A number is considered magical if it satisfies the following conditions:

//1. First, convert the number to its binary representation.
//2. Next, create a new string by replacing ever`0`with a`1`and every`1`with a`2`.
// 3. Finally, calculate the sum of all the digits in this newly created string.
//4. If this final sum is an odd number, the original number is magical.
//
// input 5 and output 2 Explanation:
//
// - 1: Binary "1" -> "2", Sum = 2 (Even)
// - 2: Binary "10" -> "21", Sum = 3 (Odd) -> Magical
//- 3: Binary "11" -> "22", Sum = 4 (Even)
//- 4: Binary "100" -> "211", Sum = 4 (Even)
//- 5: Binary "101" -> "212", Sum = 5 (Odd) -> Magical
//
//The magical numbers are 2 and 5. The total count is 2
//        ### Explanation:
//
//        - 1: Binary "1" -> "2", Sum = 2 (Even)
//        - 2: Binary "10" -> "21", Sum = 3 (Odd) -> Magical
//- 3: Binary "11" -> "22", Sum = 4 (Even)
//        - 4: Binary "100" -> "211", Sum = 4 (Even)
//        - 5: Binary "101" -> "212", Sum = 5 (Odd) -> Magical
//
//The magical numbers are 2 and 5. The total count is 2

import java.util.*;
public class Magical_Num {
    public static boolean isMagical(int n){

        String binary=Integer.toBinaryString(n);

        int zeroCount=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i) == '0') {
                zeroCount++;
            }
        }

        return zeroCount % 2 == 1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++) {
            if (isMagical(i)){
                count++;
            }
        }
        System.out.print(count);
    }
}
