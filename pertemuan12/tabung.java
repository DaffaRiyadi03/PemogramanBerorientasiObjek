package pertemuan12;

public class tabung extends lingkaran {

    private int tinggi;

    public tabung(int jari2, int tinggi) {
        super(jari2);  // Memanggil konstruktor superclass Lingkaran
        this.tinggi = tinggi;
    }

    public double luas() {
        return 2 * PHI * jari2 * (jari2 + tinggi);
    }

    // Setter & Getter
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
