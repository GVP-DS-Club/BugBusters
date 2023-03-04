import java.util.*;
public class MinimizeEnergy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
	while(t>0)
	{
	    int n=sc.nextInt();
        int a[]=new int[n];
	    int i,j,k,x=0,y,z;
	    for(i=0;i<n;i++)
	    {
	    a[i]=sc.nextInt();
	    x+=a[i];
	    }
	    y=x/n;
	    z=x%n;
	    Arrays.sort(a);
	    j=0;
	    for(i=n-1;i>n-1-z;i--)
	    {
	     j+=Math.abs(a[i]-y-1);
	    }
	    while(i>=0)
	    {
	        j+=Math.abs(a[i]-y);
	        i--;
	    }
	    j/=2;
	    System.out.print(j);
	    t--;
	}
    }
}

