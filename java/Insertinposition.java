import java.util.*;
public class Insertinposition {
    public static int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m]>target){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            int ans=searchInsert(a,k);
            System.out.print(ans);
            System.out.println();
            t--;
        }
    }
}
