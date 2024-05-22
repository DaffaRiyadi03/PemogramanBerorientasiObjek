package pertemuan12;

public abstract class bentuk {
    protected final double PHI = 3.14;
    protected int jari2;

    public bentuk(int jari2) {
        super();
        this.jari2 = jari2;
    }

    public abstract double luas();

    // setter & getter

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}