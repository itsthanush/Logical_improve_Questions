import java.util.*;
public class Vowel_Freq {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();

        String s=sc.next();//thanush;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                map.put(ch,map.getOrDefault(ch,0) + 1);
            }
        }

        char vowel= ' ';
        int max_count=0;

        for(char ch:map.keySet()){
            if(map.get(ch)>max_count){
                max_count=map.get(ch);
                vowel=ch;

            }
        }

        System.out.print(vowel + ":" +max_count);



    }
}
