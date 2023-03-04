#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t,i,j,k,x,n;
	cin>>t;
	while(t--)
	{
	    cin>>n;
	    int a[n],i,j,k,x=0,y,z;
	    for(i=0;i<n;i++)
	    {
	    cin>>a[i];
	    x+=a[i];
	    }
	    y=x/n;
	    z=x%n;
	    sort(a,a+n);
	    j=0;
	    for(i=n-1;i>n-1-z;i--)
	    {
	     j+=abs(a[i]-y-1)   ;
	    }
	    while(i>=0)
	    {
	        j+=abs(a[i]-y)   ;
	        i--;
	    }
	    j/=2;
	    cout<<j<<"\n";
	    //cout<<"\n";
	}
	return 0;
}