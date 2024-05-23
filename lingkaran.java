package pertemuan12;

public class lingkaran extends Bentuk{
    public lingkaran(int jari2) {
        super(jari2);
    }

    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }
}