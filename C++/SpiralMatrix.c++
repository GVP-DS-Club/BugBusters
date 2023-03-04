#include<bits/stdc++.h>
using namespace std;
int main(){
int t;
cin>>t;
while(t--){
    int m,n;
        cin>>m>>n;
        int matrix[m][n];
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        cin>>matrix[i][j];
 vector<int> v;
        int rmin=0,rmax=m-1,colmin=0,colmax=n-1;
        while(rmin<=rmax&&colmin<=colmax){
            for(int i=colmin;i<=colmax;i++){
                v.push_back(matrix[rmin][i]);
            }
            rmin++;
            for(int i=rmin;i<=rmax;i++){
                 v.push_back(matrix[i][colmax]);
            }
            colmax--;
            if(rmin<=rmax){
                for(int i=colmax;i>=colmin;i--){
                     v.push_back(matrix[rmax][i]);
                }
              
            }
              rmax--;
                if(colmin<=colmax){
                    for(int i=rmax;i>=rmin;i--){
                         v.push_back(matrix[i][colmin]);
                        
                    }
                    colmin++;
                }
            
        }
        for(auto i:v){
         cout<<i<<" ";}
        cout<<"\n";}
return 0;
}