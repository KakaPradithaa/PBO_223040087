package pertemuan10;
public class dokter extends jabatan {
	 private String kodedokter;
	 
	 public dokter(String kodedokter, String idjabatan, String jabatan, String gaji) {
		 super(idjabatan,jabatan,gaji);
		 setKodeDokter(kodedokter);
	 }
	 public String getKodeDokter()
	{
		 return kodedokter;
		 }
	 
	 public void setKodeDokter(String kodedokter) {
		 this.kodedokter = kodedokter;
	 }
	}