package Tugas;

public class TestKartuATM {
    public static void main(String[] args) {
        KartuATMElektronik kartuATM = new KartuATMElektronik("1234567890", "1234", 1000.0);

        // Memeriksa otorisasi PIN
        if (kartuATM.otorisasiPIN("1234")) {
            System.out.println("PIN Benar");
        } else {
            System.out.println("PIN Salah");
        }

        // Mengecek saldo
        System.out.println("Saldo sekarang: " + kartuATM.cekSaldo());

        // Menarik tunai
        kartuATM.tarikTunai(500.0);

        // Mengecek saldo setelah penarikan tunai
        System.out.println("Saldo sekarang: " + kartuATM.cekSaldo());
    }
}


