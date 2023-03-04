#include<iostream>
#include<vector>
using namespace std;
int main(){
int t;
cin>>t;
while(t--){
int n;
cin>>n;
vector<int> Shuffel;
for(int i=0;i<2*n;i++){
int x;
cin>>x;
Shuffel.push_back(x);}
int j=n;
for(int i=0;i<n;i++){
cout<<Shuffel[i]<<" ";
cout<<Shuffel[j++]<<" ";}
cout<<"\n";
}
return 0;
}