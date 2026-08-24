import java.util.*;
public class freqVowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch:str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        char ans='a';

        for(char ch:map.keySet()){
           if(map.get(ch)>map.getOrDefault(ch ,0)+ 1){
               ans=ch;
           }

        }

        System.out.println(ans);

    }
}
