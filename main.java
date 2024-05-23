package pertemuan12;

public class main {

	public static void main(String[] args) {
		 lingkaran lingkaran = new lingkaran(10);
	        System.out.println("== Lingkaran ==");
	        System.out.println("Jari2 : "+ lingkaran.getJari2());
	        System.out.println("Luas : " + lingkaran.luas());

	        tabung tabung = new tabung(10, 5);
	        System.out.println("== Tabung ==");
	        System.out.println("Jari2 : " +tabung.getJari2() + "," + "Tinggi : " + tabung.getTinggi());
	        System.out.printf("Luas : %.10f", tabung.luas());

	}

}