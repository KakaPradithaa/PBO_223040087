package pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(MataKuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        // Implementasi perhitungan IPS di sini
    }
}
