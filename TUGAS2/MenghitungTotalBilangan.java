package TUGAS2;

import java.util.Scanner;

public class MenghitungTotalBilangan {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("N = ");
	        int N = scanner.nextInt();
	        if (N <= 0) {
	            System.out.println("N tidak boleh nol atau minus");
	            System.out.println("total = 0");
	        } else {
	            int total = 0;
	            for (int i = 0; i < N; i++) {
	                int num = scanner.nextInt();
	                total += num;
	            }
	            System.out.println("total = " + total);
	        }
	    }
}
