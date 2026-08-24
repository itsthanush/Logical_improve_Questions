
//You are a structural engineer analyzing a beam. The beam is represented by an array of integers, where each integer signifies a weight placed at a specific point.
//        Your are given an array A of N integers. Your task is to return the index of the first equilibrium point found.
//        NOTE:An equilibrium point is an index in the array such that the sum of all weights to its left is equal to the
//        sum of all weights to its right. The weight at the equilibrium point itself is not included in either sum.
//


import java.util.*;
public class EquilibriumPoint {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int middle=arr.length / 2;
        //System.out.print(middle);
        //System.out.print(arr[middle]);

        //left iteration
        int leftsum=0;
        for(int i=0;i<middle;i++){
            leftsum=leftsum + arr[i];
        }

        //right iteration
        int rightsum=0;
        for(int i=middle + 1;i<arr.length;i++){
            rightsum=rightsum + arr[i];
        }
//        System.out.println(leftsum);
//        System.out.println(rightsum);



        if(leftsum==rightsum){
            System.out.println(middle);
        }
        else{
            System.out.println("-1");
        }
    }
}
