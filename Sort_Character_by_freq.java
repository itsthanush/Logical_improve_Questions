//
//Given a string s, rearrange its characters so that characters with higher frequency come first.
//
//Example
//        s = "tree"
//
//Count each character:
//
//t → 1
//r → 1
//e → 2
//
//So e must come before t and r.
//
//Possible answer:
//
//        "eetr"
//
//        "eert" is also valid.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sort_Character_by_freq {
    public static void main(String[] args){

        String s="tree";

        //count freq
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        //sort the keyset() values using arrayList
        ArrayList<Character> list=new ArrayList<>(map.keySet());

        list.sort((a,b) -> map.get(b) - map.get(a));

        //append the values in a string builder
        StringBuilder res=new StringBuilder();

        for(char c:list) {
            for (int i = 0; i < map.get(c); i++) {
                res.append(c);
            }
        }

        System.out.print(res.toString());



    }
}
