import java.util.*;
public class Words_length {
    public static void main(String[] args){

        String s="java is an best programming language";
        String[] words=s.split(" ");

        String longest="";

        for(String word:words){
            if(word.length() > longest.length()){
                longest=word;
            }
        }

        System.out.print(longest);


    }
}


