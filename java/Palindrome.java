import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t>0){
                int n=sc.nextInt();
                int ans=n;
                int sum=0;
                if(n>0){
                    while(n>0){
                        int k=n%10;
                        sum=(sum * 10)+k;
                        n=n/10;
                    }
                }
                if(sum==ans)System.out.print("YES\n");
                else{
                    System.out.print("NO\n");
                }
                t--;
            }
        }

    }
}
