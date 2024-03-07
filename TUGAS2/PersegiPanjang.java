package TUGAS2;

import java.util.Scanner;

public class PersegiPanjang {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Panjang : ");//Input panjang persegi panjang
	        double panjang = scanner.nextDouble();
	        System.out.print("Lebar : ");//Input lebar persegi panjang
	        double lebar = scanner.nextDouble();
	        double luas = panjang * lebar;
	        double keliling = 2 * (panjang + lebar);
	        System.out.println("Luas : " + luas);//Input persegi panjang
	        System.out.println("Keliling : " + keliling);// Input keliling persegi panjang
	    }
}
