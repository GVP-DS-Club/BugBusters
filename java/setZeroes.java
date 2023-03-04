import java.util.*;
public class setZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int r=sc.nextInt();
            int c=sc.nextInt();
            int mat[][]=new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            setAllZeroes(mat);
            t--;
        }           
        
    }
    public static void setAllZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int d1[]= new int[m];
        int d2[]=new int[n];
        Arrays.fill(d1,-1);
        Arrays.fill(d2,-1);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    d1[i]=0;
                    d2[j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(d1[i]==0 || d2[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
