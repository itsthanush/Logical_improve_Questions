//Sum of Even-Position Characters
//
//Given a string, calculate the alphabet values of characters at even positions.
//
//Use positions starting from 1.
//
//Input: "abcdef"
//
//Positions:
//a → 1
//b → 2
//c → 3
//d → 4
//e → 5
//f → 6
//
//        Only b, d, f.
//
//Output:
//
//        2 + 4 + 6 = 12
public class even_sum {
    public static void main(String[] args){

        String s="abcdef";
        int sum=0;
        for(int i=1;i<=s.length();i++){
            if(i % 2==0){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}
