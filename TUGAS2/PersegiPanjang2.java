package TUGAS2;

import java.util.Scanner;

public class PersegiPanjang2 {
	double panjang;
    double lebar;

    double hitungLuas() {
        return panjang * lebar;
    }

    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    void tampil() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersegiPanjang2 pp2 = new PersegiPanjang2();
        System.out.print("Panjang : ");
        pp2.panjang = scanner.nextDouble();
        System.out.print("Lebar : ");
        pp2.lebar = scanner.nextDouble();
        pp2.tampil();
    }
}
