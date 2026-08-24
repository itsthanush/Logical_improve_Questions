import java.util.*;
public class check_grid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] mat=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }


        int Row_count=0;
        //check each values same or not in the row
        for(int i=0;i<n;i++){
            boolean same=true;
            for(int j=1;j<m;j++){
                if(mat[i][j] != mat[i][0]){
                    same=false;
                    break;
                }
            }
            if(same){
                Row_count++;
            }
        }

        int Col_count=0;
        //check each values same or not in the col
        for(int j=0;j<m;j++){
            boolean same=true;
            for(int i=1;i<n;i++){
                if(mat[i][j] != mat[0][j]){
                    same=false;
                    break;
                }
            }
            if(same){
                Col_count++;
            }
        }

        int Total_count= Row_count + Col_count;
        System.out.print(Total_count);

    }
}
