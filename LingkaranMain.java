package pertemuan3;

public class LingkaranMain {
	public static void main(String[] args) {
		   lingkaran l1 = new lingkaran(5);
		   lingkaran l2 = l1;
	       System.out.println(l1.getJari2()); //5
	       System.out.println(l2.getJari2()); //5
	       ubahJari2(l2);
	       System.out.println(l1.getJari2()); //4
	       System.out.println(l2.getJari2()); //4	   
		}

		public static void ubahJari2(lingkaran obj) {
		   obj.setJari2(4);
		} 
}