import java.util.*;
public class Sumofnumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t>0){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a+b);
                t--;
            }
        }
    }
}
