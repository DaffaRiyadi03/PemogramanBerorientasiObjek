package TUGAS4;

public class MatakuliahMain {
	 public static void main(String[] args) {
	        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemograman 1", "A", 3);
	        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemograman 2", "BC", 3);
	        Matakuliah mk3 = new Matakuliah("003", "Pemograman Berorientasi Objek", "B", 3);

	        System.out.println("---Daftar MataKuliah---");
	        System.out.println(mk1.display());
	        System.out.println(mk2.display());
	        System.out.println(mk3.display());


	        System.out.println("---Nilai Ipk---");
	        //rumus : (index nilai*sks)+ (index nilai*sks) +  (index nilai*sks) ...  (index nilai*sks)/total_sks
	        int total_sks = mk1.getSks() + mk2.getSks() + mk3.getSks();
	        double total_nilai = mk1.nilaiIndex() + mk2.nilaiIndex() + mk3.nilaiIndex();
	        double ipk = total_nilai / total_sks;
	        System.out.println("Nilai ipk");

	        System.out.println("total sks " + total_sks);
	        System.out.println("total nilai " + total_nilai);
	        System.out.println("total ipk " + ipk);
	    }
}
