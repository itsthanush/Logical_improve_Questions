import java.util.*;
public class maxiScore {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String s = sc.next();

        char[] arr=s.toCharArray();

        Arrays.sort(arr);
        int total=0;

        for(int i=n - 1;i>=0;i--){
            int digit =arr[i] - '0';
            int remaining = i;

            total += digit * remaining;
        }
        System.out.print(total);

    }
}
