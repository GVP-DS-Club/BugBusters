import java.util.*;
public class ComplementofGray {
    public static long grayToBinary(long gray) {
        long mask = gray;
        while ((mask >>> 1) != 0) {
            mask >>>= 1;
            gray ^= mask;
        }
        return gray;
    }

    public static long twosComplement(long binary) {
        return (~binary) + 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextInt();
            long gtb=grayToBinary(n);
            long ans=twosComplement(gtb);
            System.out.print(ans);
            System.out.println();
            t--;
        }
    }
    
    
}
