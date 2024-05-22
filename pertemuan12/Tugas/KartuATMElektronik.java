package Tugas;

public class KartuATMElektronik implements KartuATM {
    private String nomorKartu;
    private String pin;
    private double saldo;

    public KartuATMElektronik(String nomorKartu, String pin, double saldo) {
        this.setNomorKartu(nomorKartu);
        this.pin = pin;
        this.saldo = saldo;
    }

    @Override
    public boolean otorisasiPIN(String pinInput) {
        return pin.equals(pinInput);
    }

    @Override
    public double cekSaldo() {
        return saldo;
    }

    @Override
    public boolean tarikTunai(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
            return false;
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan tunai sebesar " + jumlah + " berhasil.");
            return true;
        }
    }

	public String getNomorKartu() {
		return nomorKartu;
	}

	public void setNomorKartu(String nomorKartu) {
		this.nomorKartu = nomorKartu;
	}

	public void setorTunai(double jumlahSetor) {
		// TODO Auto-generated method stub
		
	}
}