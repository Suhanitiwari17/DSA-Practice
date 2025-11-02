#include <bits/stdc++.h>
using namespace std;

int countSetBits(int n){
    int count=0;
    while(n!=0){
        n=n&(n-1);
        count++;
    }
    return count;
};

int main() {
    int n = 29;  // Example input for n (binary: 11101)

    
    int result =countSetBits(n);

    cout << "The number of set bits is: " << result << endl;

    return 0;
}
