import java.util.*;
public class MissingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int xor1=0;
        int xor2=0;

        for(int i=0;i<=n;i++){
            xor1=xor1 ^ i;
        }

        for (int i=0;i<n;i++){
            xor2=xor2 ^ nums[i];
        }

        int res=xor1 ^ xor2;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+ 1 );
        }

        int repeating = -1;

        for(int num :nums){
            if(map.get(num)>1){
                repeating=num;
                break;
            }
        }


        System.out.println("The Missing number is: "+res);
        System.out.print("The repeating number is: "+repeating);





    }
}
