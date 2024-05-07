package TUGAS_INHERITANCE;

public class InheritanceMain {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Mengdem", "Kampung", 17);
        System.out.println("Nama: " + kucing.getNama());
        System.out.println("Jenis: " + kucing.getJenis());
        System.out.println("Umur: " + kucing.getUmur() + " tahun");
    }
}
