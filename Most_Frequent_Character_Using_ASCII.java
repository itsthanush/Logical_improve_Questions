import java.util.*;
public class Most_Frequent_Character_Using_ASCII {
    public static void main(String[] args){

        String s="abcd";

        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+ 1);
        }

        char max=' ';
        int ans=0;
        for(char ch:map.keySet()){
            if(map.get(ch)>ans){
                ans=map.get(ch);
                max=ch;

            }
        }
        int ascii=(int)(max);

        System.out.println("Most freq Character:"+max);
        System.out.println("Ascii Value:"+ascii);
        System.out.println("Character freq:"+ans);


    }
}
