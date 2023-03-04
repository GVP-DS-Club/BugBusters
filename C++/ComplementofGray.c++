#include <iostream>
#include <vector>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        string a;
        cin >> a;
        vector<int> b;
        int l = a.length();
        int x = a[0] - '0';
        b.push_back(x);
        for (int i = 1; i < l; i++) {
            int y = a[i] - '0';
            int z = y ^ x;
            x = y;
            b.push_back(z);
        }
        for (int i = 0; i < l; i++) {
            if (b[i] == 1) {
                b[i] = 0;
            } else {
                b[i] = 1;
            }
        }
        int i = l - 1;
        while (i >= 0) {
            if (b[i] == 0) {
                b[i] = l;
                break;
            } else {
                b[i] = 0;
            }
            i--;
        }
        if (i == -1) {
            cout << '1';
        }
        for (int i = 0; i < l; i++) {
            cout << b[i];
        }
        cout << endl;
    }
    return 0;
}
