//Character Position Product
//
//For every character, multiply its alphabet position by its position in the string.
//
//Example:
//
//Input: "abc"
//
//a → 1 × 1
//b → 2 × 2
//c → 3 × 3
//
//Output: 14
public class Position_prod {
    public static void main(String[] args){

        String s="abc";
        int sum=0;
        int prod=1;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            int position=i + 1;
            sum+=position * position;
        }

        System.out.print(sum);

    }
}
