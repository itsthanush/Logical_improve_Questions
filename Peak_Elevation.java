//A hiker is trekking through a mountain range. During the trek, they record their elevation at various points. The sequence of recorded elevations first increases and then may decrease, forming a shape similar to a mountain.
//Your task is to find the highest elevation point the hiker reached. This highest point is called the "elevation point" or the peak of the trek.
//Given a sequence of elevations, find the maximum elevation.

import java.util.*;
public class Peak_Elevation {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        if(largest==0){
            System.out.print("-1");
        }
        else {
            System.out.print(largest);
        }
    }
}
