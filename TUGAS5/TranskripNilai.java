package TUGAS5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
	
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalBobot = 0.0;
        double totalSKS = 0.0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                double bobot = bobotNilai(mk.getNilai());
                totalBobot += bobot * mk.getSks();
                totalSKS += mk.getSks();
            }
        }

        if (totalSKS > 0) {
            ipk = totalBobot / totalSKS;
        } else {
            ipk = 0.0;
        }
    }

  
    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    /* Setter & Getter */
    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
        this.kartuHasilStudi = kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

	 private double bobotNilai(String nilai) {
	        if (nilai != null) {
	            switch (nilai) {
	                case "A":
	                    return 4.0;
	                case "AB":
	                    return 3.5;
	                case "B":
	                    return 3.0;
	                case "BC":
	                    return 2.5;
	                case "C":
	                    return 2.0;
	                case "D":
	                    return 1.5;
	                case "E":
	                    return 1.0;
	                default:
	                    return 0.0;
	            }
	        } else {
	            return 0.0; // Atau nilai default yang sesuai dengan kebutuhan Anda
	        }
	    }
}
