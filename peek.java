import java.util.*;
public class peek {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 9, 7, 3, 1, 4};

        int maxSum = 0;

        for (int i = 1; i < arr.length - 1; i++) {

            // Find peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {

                int sum = arr[i];

                // Go left
                int j = i - 1;
                while (j >= 0 && arr[j] < arr[j + 1]) {
                    sum += arr[j];
                    j--;
                }

                // Go right
                j = i + 1;
                while (j < arr.length && arr[j] < arr[j - 1]) {
                    sum += arr[j];
                    j++;
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}