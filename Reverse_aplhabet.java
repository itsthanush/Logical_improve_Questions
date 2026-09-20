//1. Reverse Alphabet Sum
//
//Given a string, calculate the sum of the reverse alphabet position of every character.
//
//        a = 26
//b = 25
//        ...
//z = 1
//
//Example:
//
//Input:  "abc"
//Output: 75
//
//Because:
//
//a = 26
//b = 25
//c = 24
//
//        26 + 25 + 24 = 75
public class Reverse_aplhabet {
    public static void main(String[] args){

        String s="abc";
        int sum=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            int reverseIndex='z' - ch + 1;
            sum+=reverseIndex;
        }

        System.out.print(sum);
    }
}
