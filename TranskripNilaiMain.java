package pertemuan7;

public class TranskripNilaiMain {

    public static void main(String[] args) {
        // Membuat objek matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("003", "Algoritma Pemrograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("002", "Pemrograman Berorientasi Objek", "B", 3);
        

        // Membuat objek KartuHasilStudi
        KartuHasilStudi khs = new KartuHasilStudi("20222");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("303040001", "John Doe");

        // Membuat objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mahasiswa);
        transkrip.addKartuHasilStudi(khs);

        // Menampilkan transkrip nilai
        transkrip.display();
    }
}

