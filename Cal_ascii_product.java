import java.util.*;
public class Cal_ascii_product {
    public static void main(String[] args){

        String s="aaaaa";

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        System.out.println(map);

        int sum=0;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            char ascii=entry.getKey();
            int frq=entry.getValue();

          int prod=((int) ascii * frq);
          int Mod_res=prod%5;
            if(Mod_res!=0){
                sum=sum+Mod_res;
            }
        }

        System.out.println("Total Freq * ascii value is = "+sum);


    }
}
