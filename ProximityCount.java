import java.util.*;
public class ProximityCount {

    public static int proximitycount(int n,int[] arr,int Num,int Diff){

        int count=0;
        for(int i=0;i<n;i++){
            int Absolute_diff=Math.abs(arr[i] - Num);
            if(Absolute_diff <= Diff){
                count++;
            }

            if(count == 0){
                return -1;
            }
        }
        return count;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int Num=sc.nextInt();
        int Diff=sc.nextInt();

        System.out.print(proximitycount(n,arr,Num,Diff));

    }
}
