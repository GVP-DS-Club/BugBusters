#include<bits/stdc++.h>
using namespace std;
bool isValid(string s){
     map<char,char> m={{'(',')'},{'{','}'},{'[',']'}};
     stack<char> sc;
        bool y=true;
        if(s.size()%2==0){
     for(auto x:s){
         if(x=='('||x=='{'||x=='['){
             sc.push(x);
         }
         else{
             if(sc.empty()) return false;
             char z=sc.top();
             if(x!=m[z])
             {   y=false;
                 break;
             }
             else{
                 sc.pop();
             }
         }
     }   
        }
        else{
            y=false;
        }
        if(sc.size()!=0)
            y=false;
     return y;   
    }
int main(){
int t;
cin>>t;
while(t--){
string s;
cin>>s;
if(isValid(s))
cout<<"YES\n";
else
cout<<"NO\n";
}
return 0;
}