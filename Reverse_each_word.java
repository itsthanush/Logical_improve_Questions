//import java.util.*;
//public class Reverse_each_word {
//    public static void main(String[] args){
//
//        String s="hello world";
//        String[] words=s.split(" ");
//
//        String res="";
//        for(String word:words){
//
//
//            for(int i=word.length() - 1;i>=0;i--){
//                res=res + word.charAt(i);
//            }
//
//        }
//        System.out.println(res + " ");
//
//
//    }
//}


//reverse the order of word
import java.util.*;
public class Reverse_each_word {
    public static void main(String[] args) {

        String s = "java is easy";
        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
        }


    }
}