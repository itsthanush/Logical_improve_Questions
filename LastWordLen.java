//Your task is to find the length of the last word in the string .
//A word is defined as a maximal substring consisting of non-space characters only.
//The string may have leading or trailing spaces.

//sample input:
//  I am  a passionate   Developer
//output: 9


import java.util.*;
public class LastWordLen {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        int count=0;
        char[] arr=str.toCharArray();
       for(int i=arr.length - 1;i>=0;i--){
            if(arr[i]!=' ') {
                count++;
            }
            else{
                break;
            }
        }
       System.out.print(count);
    }
}
