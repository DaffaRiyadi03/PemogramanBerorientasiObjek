package TUGAS3;

public class ObjekSebagaiParameterFungsi {

	private static Lingkaran lingkaran11;
	private static Lingkaran lingkaran12;

	public static void main(String[] args) {
        lingkaran11 = new Lingkaran(5);
        lingkaran12 = lingkaran11;
        System.out.println(lingkaran11.getJari2()); // 5
        System.out.println(lingkaran12.getJari2()); // 5
        ubahJari2(lingkaran12);
        System.out.println(lingkaran11.getJari2()); // 4
        System.out.println(lingkaran12.getJari2()); // 4
    }

    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(4);
    }
}
