import java.util.*;
public class NextGreaterEle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();//4
        int[] arr=new int[n];//4 5 2 25

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int ans=-1;
            for(int j=i + 1;j<n;j++){
                if(arr[j]>arr[i]){
                    ans=arr[j];
                    break;
                }
            }
            System.out.print(ans + "   ");
        }

    }
}
