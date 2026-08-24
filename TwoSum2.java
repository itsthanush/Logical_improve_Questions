import java.util.*;
public class TwoSum2 {
    public static int[] twoSum2(int n, int target,int[] nums) {

        for(int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int target=sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }


        System.out.print(Arrays.toString(twoSum2(n,target,nums)));
    }
}
