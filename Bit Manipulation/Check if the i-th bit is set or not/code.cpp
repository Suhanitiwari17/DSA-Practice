#include <bits/stdc++.h>
using namespace std;

bool checkSetBit(int n,int i){
    if(n & (1 << i) != 0){
        return true;
    }else{
        return false;
    }
}

int main() {

    int num = 5;  
    int bitIndex = 2; 

    if (checkSetBit(num, bitIndex)) {
        cout << "The " << bitIndex << "-th bit of " << num << " is set (1)." << endl;
    } else {
        cout << "The " << bitIndex << "-th bit of " << num << " is not set (0)." << endl;
    }

    return 0;
}
