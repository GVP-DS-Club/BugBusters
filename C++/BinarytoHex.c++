#include <iostream>
#include <string>

using namespace std;

char hexLookupTable[] = {'0', '1', '2', '3', '4', '5', '6', '7',
                         '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

string binaryToHex(string binary) {
    string hex = "";
    int i = 0;
    while (i < binary.length()) {
        int nibble = 0;
        for (int j = 0; j < 4 && i < binary.length(); j++, i++) {
            nibble = (nibble << 1) + (binary[i] - '0');
        }
        hex += hexLookupTable[nibble];
    }
    return hex;
}

int main() {
    int t;
    cin<<t;
    while(t--){
        string binary;
        cin>>binary;
        string hex = binaryToHex(binary);
        cout<<(hex);
        cout<<"\n";
    }
    return 0;
}
