package Latihan1;

public class lingkaran extends bentuk {
    
    public lingkaran(int jari2) {
        super(jari2);
    }

    /*
     * L: PHI*r*r
     */

    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }
}