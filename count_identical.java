import java.util.Scanner;

public class count_identical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//n=11
        int[] arr = new int[n];//{2,3,3,3,2,2,6,4,4,4,4}

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int identical_count = 0;
        int i = 0;
        while (i < n) {
            int count = 0;
            int curr_val = arr[i];

            while ( i < n && arr[i] == curr_val){
                count++;
                i++;
        }

        if (count == curr_val) {
            identical_count++;
        }

    }
        System.out.print(identical_count);


    }
}
