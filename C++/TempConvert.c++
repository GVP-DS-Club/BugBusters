#include<iostream>
using namespace std;
int main(){
int t;
cin>>t;
while(t--){
int f;
cin>>f;
double c=0.0;
c=(f-32)*(double)5/9;
printf("%. 2f\n", ((signed long)(c * 100) * 0.01f));
}
return 0;}