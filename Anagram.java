import java.util.*;
public class Anagram {
    public static boolean anagram(String s,String t){

                     //simple trick//

        //1.convert String s,t into LowerCase():
        s=s.toLowerCase();
        t=t.toLowerCase();

        //2.convert  String  into  CharArray:
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();

        //3.Sort the CharArray
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //4.Use .equals() func to compare the two arrays:

        if(s.length()!=t.length()){
            return false;
        }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();//listen
        String t=sc.nextLine();//silent
        System.out.print(anagram(s,t));

    }
}
