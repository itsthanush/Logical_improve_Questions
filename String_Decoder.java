import java.util.*;
public class String_Decoder {
    public static void main(String[] args){

        String s="101101110";
        int count=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch== '1'){
                count++;
            }
            else if(ch =='0'){
                char letter=(char) (count + 'A' - 1);//for upper case use 'A' and for lower case use 'a';\
                System.out.print(letter);
                count=0;
            }
        }

    }
}
