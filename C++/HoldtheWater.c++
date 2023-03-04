#include<iostream>
using namespace std;
int main(){
  int t;
  cin>>t;
  while(t--){
  int n;
  cin>>n;
  int height[n]; 
  for(int i=0;i<n;i++)
  cin>>height[i];
        int l = 0, r = n - 1, ans = 0;
        while (l < r)
        {
            int max_pos_height = min(height[l], height[r]);
            ans = max(ans, (r - l) * max_pos_height);
            while (l < r && height[l] <= max_pos_height) l++;
            while (l < r && height[r] <= max_pos_height) r--;
        }
        cout<<ans<<"\n";
}
return 0;
}