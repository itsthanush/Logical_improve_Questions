import java.util.*;
public class most_frequently {

    public static void main(String[] args){

        String s="Banana";

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }


        int max=0;
        char most_frq=' ';

        for(char ch:map.keySet()){
            if(map.get(ch)>max){
                max= map.get(ch);
                most_frq=ch;
            }

        }

        System.out.println(max);
        System.out.print(most_frq);


    }

}
