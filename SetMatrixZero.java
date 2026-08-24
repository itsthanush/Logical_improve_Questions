import java.util.*;
public class SetMatrixZero {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();

        boolean[] rows=new boolean[m];
        boolean[] cols=new boolean[n];


        int[][] mat=new int[m][n];

        m=mat.length;
        n=mat[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }


        //check the rows and cols contains zeros
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    rows[i]=true;
                    cols[j]=true;
                }
            }
        }

        //set the cells to zero
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rows[i] || cols[j]){
                    mat[i][j]=0;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
