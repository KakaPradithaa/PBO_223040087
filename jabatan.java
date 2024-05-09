package pertemuan10;

public class jabatan {
	  protected String idjabatan;
	  protected String jabatan;
	  protected String gaji;
	  
	  public jabatan(String idjabatan, String jabatan, String gaji) {
		  this.idjabatan = idjabatan;
		  this.jabatan = jabatan;
		  this.gaji = gaji;
	  }
	  
	  public String getIdJabatan() {
		  return idjabatan;
	  }
	  public String getJabatan() {
		  return jabatan;
	  }
	  
	  public String getGaji() {
		  return gaji;
	  }
	}