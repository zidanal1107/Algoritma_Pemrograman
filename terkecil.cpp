#include <iostream>
using namespace std;

int main() {
    int a,b,c,min;
    cout<<"Masukkan nilai a: ";
    cin>>a;
    cout<<"Masukkan nilai b: ";
    cin>>b;
    cout<<"Masukkan nilai c: ";
    cin>>c;
    min=a;
    if (b<min)
    {
        min=b;
    } 
    if (c<min)
    {
        min=c;
    }
    cout<<min<<endl;
    
    return 0;
}