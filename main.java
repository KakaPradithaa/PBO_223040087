package pertemuan10;

public class main {
    public static void main(String[] args) {
    	dokter pg = new dokter("223040087", "2304506", "SPECIALIST","100.000.000");
        System.out.println(pg.getKodeDokter() + " - " + pg.getIdJabatan() + " - " + pg.getJabatan() + " - " + pg.getGaji());
    }
}