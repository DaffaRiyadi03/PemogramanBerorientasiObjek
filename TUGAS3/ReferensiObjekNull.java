package TUGAS3;

public class ReferensiObjekNull {
	
	public static void main(String[] args) {
	//Lingkaran l1 = new Lingkaran(5);
	//Lingkaran l2 = l1;
	//Lingkaran l3 = new Lingkaran(7);
	//System.out.println(l1.getJari2());
	//System.out.println(l2.getJari2());
	//System.out.println(l3.getJari2());
	//l2 = null; //l2 tidak lagi mereferensi ke objek Lingkaran
	//System.out.println(l1.getJari2());
	//System.out.println(l2.getJari2()); //Error
	//System.out.println(l3.getJari2());
	//}
	
	Lingkaran l1 = new Lingkaran(5);
	Lingkaran l2 = l1;
	Lingkaran l3 = new Lingkaran(7);
	System.out.println(l1.getJari2());
	System.out.println(l2.getJari2());
	System.out.println(l3.getJari2());
	l1 = null;
	l2 = null;
	l3 = null;
	}
}
