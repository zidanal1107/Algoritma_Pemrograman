#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double a,b,c,x1,x2,D;
    cout<<"Masukkan nilai variable a: ";
    cin>>a;
    cout<<"Masukkan nilai variable b: ";
    cin>>b;
    cout<<"Masukkan nilai variable c: ";
    cin>>c;

    D = b*b - 4*a*c;
    if (D < 0)
    {
        cout<<"Persamaan tidak memiliki akar" << endl;
    } else if (D == 0)
    {
        x1 = -b / (2*a);
        cout<<"Persamaan memiliki satu akar: "<<x1<<endl;
    } else
    {
        x1 = (-b + sqrt(D)) / (2 * a);
        x2 = (-b - sqrt(D)) / (2 * a);
        cout<<"Persamaan memiliki dua akar: "<<x1<<" dan "<<x2<<endl;
    }
    return 0;
}