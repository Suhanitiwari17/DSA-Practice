#include <bits/stdc++.h>
using namespace std;

void swapnum(int a,int b){
    a=a^b;
    b=a^b;
    a=a^b;

}
int main() {
    int a = 5, b = 10;

    
    swapnum(a, b);

   
    cout << "a = " << a << ", b = " << b << endl;

    return 0;
}
