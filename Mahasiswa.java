package pertemuan7;

public class Mahasiswa {
    private String NRP;
    private String nama;

    
    public Mahasiswa() {
    	// Auto-generated constructor stub
    }

    // Constructor dengan parameter
    public Mahasiswa(String NRP, String nama) {
        super();
        this.NRP = NRP;
        this.nama = nama;
    }

    // Method untuk menampilkan informasi mahasiswa
    public String display() {
        return "NRP: " + NRP + ", Nama: " + nama;
    }

}

