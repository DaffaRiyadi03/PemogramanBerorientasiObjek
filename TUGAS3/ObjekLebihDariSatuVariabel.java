package TUGAS3;

public class ObjekLebihDariSatuVariabel {

    public static void main(String[] args) {
        Lingkaran lingkaran11 = new Lingkaran(5);
        Lingkaran lingkaran12 = lingkaran11;
        System.out.println(lingkaran11.getJari2()); // 5
        System.out.println(lingkaran12.getJari2()); // 5
        lingkaran12.setJari2(10);
        System.out.println(lingkaran11.getJari2()); // 10
        System.out.println(lingkaran12.getJari2()); // 10
    }
}
