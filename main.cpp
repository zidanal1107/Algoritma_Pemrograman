#include <iostream>
using namespace std;

int main() {
    double jml_hadir, jml_pertemuan, persentase;

    cout << "Masukkan nilai jml_hadir: ";
    cin >> jml_hadir;

    cout << "Masukkan nilai jml_pertemuan: ";
    cin >> jml_pertemuan;

    persentase = (jml_hadir / jml_pertemuan) * 100;

    if (persentase>=75)
    {
        cout << "Memenuhi" << endl;
    } else
    {
        cout << "Tidak memenuhi" << endl;
    }    
    return 0;
}