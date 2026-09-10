import java.util.*;
public class Sec_largest {
    public static void main(String[] args){

        int[] arr={10 ,5 ,20 ,8 ,20, 15, 3};

        //initial two values
        int max1=0;
        int max2=0;

        //compare it with the first 2 elements(arr[0] and arr[1]):

        if(arr[0] > arr[1]){
            max1=arr[0];
            max2=arr[1];
            }
        else {
            max2 = arr[0];
            max1 = arr[1];
        }


        //Now iterate from 3rd element means 2 index
        for(int i=2;i<arr.length;i++){
            if(arr[i] > max1){

                max2=max1;
                max1=arr[i];

            }

            //also check if the array will have any duplicates
            else if(arr[i] > max2 && arr[i] != max1){
                max2=arr[i];
            }
        }

        System.out.println(max1 + " Largest value in the array");
        System.out.print(max2 + " Second largest value in the array");

    }
}
