import java.util.*;
public class First_Non_Repeating_Character {
    public static void main(String[] args){
        String s="swiss";

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        char res=' ';
        for(char ch :map.keySet()){
            if(map.get(ch) == 1){
                res = ch;
                break;
            }
        }

        System.out.println(map);
        if (res != '\0') {
            System.out.println("The first non-repeating character is: " + res); // Output: w
        } else {
            System.out.println("All characters repeat.");
        }

    }
}
