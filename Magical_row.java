import java.util.*;
public class Magical_row {
    public static void main(String[] args){

        int n=3;
        int m=3;
        int[][] mat=new int[n][m];

        //Declare a 2d matrix
        mat=new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int Magical_row=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                if(mat[i][j] % 2 !=0){
                    sum+=mat[i][j];
                }
            }

            if(sum % 2 == 0){
                Magical_row++;
            }
        }

        System.out.print(Magical_row);

    }
}
