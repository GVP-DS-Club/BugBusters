#include <iostream>
#include <vector>
using namespace std;

int main() {
    int t;
    cin >> t;
    
    while (t--) { // corrected the while loop condition
        int n, m;
        cin >> n >> m;
        int matrix[n][m]; // corrected the matrix declaration
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> matrix[i][j];
            }
        }
        
        vector<pair<int, int>> v;
        int j;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < m; j++) { // corrected the loop condition
                if (matrix[i][j] == 0)
                    v.push_back(make_pair(i, j)); // corrected the pair initialization
            }
        }
        
        for (int i = 0; i < v.size(); i++) {
            int k = v[i].first;
            j = v[i].second;
            for (int h = 0; h < m; h++) {
                matrix[k][h] = 0;
            }
            
            for (int h = n - 1; h >= 0; h--) { // corrected the loop condition
                matrix[h][j] = 0;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cout << matrix[i][j] << " "; // corrected the output statement
            }
            cout << endl; // added endl after each row
        }
    }
    
    return 0; // corrected the return statement
}