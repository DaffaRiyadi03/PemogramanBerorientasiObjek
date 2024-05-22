package Latihan1;

public class main {
	public static void main(String[] args) {
        lingkaran lingkaran = new lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("jari-jari: " + lingkaran.getJari2());
        System.out.println("luas: " + lingkaran.luas());

        tabung tabung = new tabung(10, 5);
        System.out.println("== Tabung ==");
        System.out.println("jari-jari: " + tabung.getJari2() + ", Tinggi: " + tabung.getTinggi());
        System.out.println("luas: " + tabung.luas());
    }
}
