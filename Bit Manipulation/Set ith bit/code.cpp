

#include <bits/stdc++.h>
using namespace std;

void printBinary(int n) {
    for (int i = 7; i >= 0; i--) {
        cout << ((n >> i) & 1);
    }
    cout << endl;
}

int SetBits(int n, int i) {
    int ans = n | (1 << i);
    return ans;
}

int main() {
    int n = 29;
    int i = 5;

    cout << "Original number in binary: ";
    printBinary(n);

    int result = SetBits(n, i);

    cout << "After setting bit " << i << ": ";
    printBinary(result);

    cout << "Decimal result: " << result << endl;
}
