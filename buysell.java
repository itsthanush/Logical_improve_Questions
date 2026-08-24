import java.util.*;
public class buysell {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        int buy=arr[0];
        int profit=0;

        for(int i=1;i<n;i++){
            if(arr[i] < buy){
                buy=arr[i];
            }
            else if(arr[i] - buy > profit){
                profit=arr[i] - buy;
            }
        }

        System.out.print(profit);
    }
}
