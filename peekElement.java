import java.util.*;
public class peekElement {
    public static void main(String[] args){

        int[] arr={1,3,5,4,2};
        int count=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                count++;
                System.out.print(arr[i]);
            }
        }

        System.out.println(" ");
        System.out.print(count);

    }
}
