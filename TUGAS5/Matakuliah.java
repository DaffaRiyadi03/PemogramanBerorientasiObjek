package TUGAS5;


public class Matakuliah {
	 private String kode, nama, index;
	    private int sks;

	    public Matakuliah(String kode, String nama, String index, int sks) {
	        super();
	        this.kode = kode;
	        this.nama = nama;
	        this.index = index;
	        this.sks = sks;
	    }

	    public int getSks(){
	        return sks;
	    }

	    public String display(){
	        return kode + " - " + nama + " - " + index +  " - " + sks;
	    }

		public String getNilai() {
			// TODO Auto-generated method stub
			return index;
		}

}
