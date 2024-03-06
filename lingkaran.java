package pertemuan3;

public class lingkaran {

	    public static void main(String[] args) {
	    	lingkaran l1 = new lingkaran(5);
	    	lingkaran l2 = l1;
	    	lingkaran l3 = new lingkaran(7);
	    	System.out.println(l1.getJari2());
	    	System.out.println(l2.getJari2());
	    	System.out.println(l3.getJari2());
	    	l2 = null;
	    	System.out.println(l1.getJari2());
	    	if (l2 != null) 
	    	System.out.println(l2.getJari2());
	    	System.out.println(l3.getJari2());
	    }
	    
	    private int jari2;

	    public lingkaran(int jari2) {
	        this.jari2 = jari2;
	    }

	    public int getJari2() {
	        return jari2;
	    }

	    public void setJari2(int jari2) {
	        this.jari2 = jari2;
	    }
}