import java.util.*;
public class Vowel
{
    public static void main(String[] args) {
        String s="take you forward is awesome";

        int vowels=0;
        int consonants=0;
        int white_space=0;



        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }

            if (ch >= 'a' && ch <= 'z' &&
                    ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                consonants++;
            }
            if(ch==' '){
                white_space++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(white_space);

    }
}