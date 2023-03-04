import java.util.*;
public class MatchthePairs {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t>=0){
                int n=sc.nextInt();
                ArrayList<Integer> Shuffel = new ArrayList<>();
                for(int i=0;i<2*n;i++){
                    int x=sc.nextInt();
                    Shuffel.add(x);
                }
                int j=n;
                for(int i=0;i<n;i++){
                    System.out.print(Shuffel.get(i)+" ");
                    System.out.print(Shuffel.get(j++)+" ");
                }
                System.out.print("\n");
                t--;
            }
        }
    }
}
