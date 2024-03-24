package pertemuan7;

public class MataKuliah {
    private String kode;
    private String nama;
    private String nilai;
    private int sks;

    public MataKuliah(String kode, String nama, String nilai, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.nilai = nilai;
        this.sks = sks;
    }

    // Getter dan Setter untuk atribut Matakuliah
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    // Metode untuk menampilkan informasi Matakuliah
    public String display() {
        return "Kode: " + kode + ", Nama: " + nama + ", Nilai: " + nilai + ", SKS: " + sks;
    }
}
