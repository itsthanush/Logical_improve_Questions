import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int m = sc.nextInt();

        int n = sc.nextInt();

        int[] nums1 = new int[m + n];

        System.out.println("Enter nums1 elements:");

        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int[n];

        System.out.println("Enter nums2 elements:");

        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        for(int l=0;l<m;l++) {
            System.out.print(nums1[l]);
        }

    }
}
