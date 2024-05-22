package Latihan2;

public class KartuElektronik implements Kartu {
    private String kodeBank;
    private String pin;

    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    @Override
    public boolean otentikasi(String pinInput) {
        return pin.equals(pinInput);
    }

    @Override
    public String encode(String pin) {
        // Melakukan enkripsi inputan PIN
        return null;
    }
}