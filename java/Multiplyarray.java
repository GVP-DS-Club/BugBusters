import java.util.*;
public class Multiplyarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            productExceptSelf(a);
            t--;
            System.out.println();
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] op = new int[nums.length];
        boolean zero=false;
        int res=1;
        int index=0;
        for(int i=0;i<nums.length;i++) {        
            if(nums[i]==0) {
			  // it means second zero occurred hence return empty array
                if(zero) {
                    return op;
                }
				//else set index of zero element
                zero=true;
                index=i;
            } else {
			  //prepare product 
                res=res*nums[i];    
            }
            
        }
		//check single zero case
        if(zero) {
         op[index]=res;   
        } else { 
		// it means no zero present
            for(int i=0;i<nums.length;i++) {
                op[i]=res/nums[i];
            }
        }
        return op;
    }
}

