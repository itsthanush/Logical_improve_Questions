import java.util.*;
public class TwoSum {
    public static int[] twosum(int n, int target, int[] nums) {


        //create 2 arr space
        int[] res=new int[2];
        //using 2 loops
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return  new int[] {i,j};
                }
            }
        }

        return new int[]{};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];


        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(twosum(n,target,nums)));
    }
}

