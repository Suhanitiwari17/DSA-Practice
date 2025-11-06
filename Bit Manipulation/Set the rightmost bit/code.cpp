#include <bits/stdc++.h>
using namespace std;


int setRightmostUnsetBit(int n) {
    return n | (n + 1);
}

int main() {
  
    int n = 10; 

   
    int result = setRightmostUnsetBit(n);
