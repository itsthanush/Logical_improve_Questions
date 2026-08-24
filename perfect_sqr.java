import java.util.*;
public class perfect_sqr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s=sc.next();//aaabbbccc

        int n=(int) Math.sqrt(s.length());
        char[][] mat=new char[n][n];

        int k=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=s.charAt(k++);
            }
        }

        //check the row values same or not
        int Row_count=0;
        for(int i=0;i<n;i++){
            boolean same=true;
            for(int j=1;j<n;j++){
                if(mat[i][j] != mat[i][0]){
                    same=false;
                    break;
                }
            }
            if(same){
                Row_count++;
            }
        }


        //check the col values same or not
        int Col_count=0;
        for(int j=0;j<n;j++){
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

        int Total_count=Row_count + Col_count;
        System.out.print(Total_count);
    }
}
