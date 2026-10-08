import java.util.*;
public class Shift_char_by_k {
    public static void main(String[] args){

        String s="abcd";
        int k=2;
        //String res="";

        StringBuilder res=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            int ascii=(int)(ch);
            ascii=ascii + k;
            char letter=(char)(ascii);
            res.append(letter);
        }

        System.out.print(res);

    }
}
