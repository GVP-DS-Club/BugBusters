#include <iostream>
using namespace std;

int main() {
    int t;
    cin >> t;
    
    while (t--) { // corrected the while loop condition
        int n;
        cin >> n;
        int sum = 0, k; // corrected the sum initialization and added a comma
        
        if (n > 0) {
            int temp = n; // added a variable to store the original value of n
            
            while (n > 0) {
                k = n % 10;
                sum = (sum * 10) + k;
                n = n / 10; // corrected the loop condition
            }
            
            if (sum == temp) // corrected the if statement condition and added the comparison operator
                cout << "YES" << endl; // corrected the output statement
            else
                cout << "NO" << endl; // corrected the output statement
        } else {
            cout << "NO" << endl; // corrected the output statement
        }
    }
    
    return 0; // corrected the return statement
}