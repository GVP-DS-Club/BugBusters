import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>=0){
            int row=sc.nextInt();
            int col=sc.nextInt();
            int mat[][] = new int[row][col];
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            List<Integer> ans=new ArrayList<Integer>();  
            ans = spiralOrder(mat);
            for(int i=0;i<ans.size();i++){
                int x=ans.get(i);
                System.out.print(x);
            }
            t--;
            System.out.println();
        }
        
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;

        int l=0,r=m-1; //col
        int t=0,b=n-1;//row
        int dir=0; //direction

        while(l<=r && t<=b){
            if(dir==0){
                for(int i=l;i<=r;i++){
                    ans.add(matrix[t][i]);
                }
                dir=1;
                t++; // increased row
            }
            else if(dir==1){
                for(int i=t;i<=b;i++){
                    ans.add(matrix[i][r]);
                }
                dir=2;
                r--;
            }
            else if(dir==2){
                for(int i=r;i>=l;i--){
                    ans.add(matrix[b][i]);
                }
                dir=3;
                b--;
            }
            else if(dir==3){
                for(int i=b;i>=t;i--){
                    ans.add(matrix[i][l]);
                }
                dir=0;
                l++;
            }
        }
        return ans;
    }
}
