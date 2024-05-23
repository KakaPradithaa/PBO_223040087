package pertemuan12;
public class tabung extends Bentuk{
    private int tinggi;
    public tabung() {
        super(0);
    }

    public tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 2*PHI*jari2*(jari2+tinggi);
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}