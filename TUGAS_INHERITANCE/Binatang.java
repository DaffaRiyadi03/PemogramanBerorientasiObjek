package TUGAS_INHERITANCE;

public class Binatang {
    private String jenis;
    private int umur;

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public Binatang(String jenis, int umur) {
        this.jenis = jenis;
        this.umur = umur;
    }
}

