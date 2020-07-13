package ManajemenKaryawan;

public class IdentitasKaryawan {

	private String namaLengkap;
	private char[] nomorHP = new char[12];
	private	String email;
	private int kendaraan;
	
	public IdentitasKaryawan() {}
	public IdentitasKaryawan(String namaLengkap, char[] nomorHP, String email, int kendaraan) {
	this.namaLengkap = namaLengkap;
	this.nomorHP = nomorHP;
	this.email = email;
	this.kendaraan = kendaraan;
	}
	
	// method namaLengkap
	public String getnamaLengkap() {
		return this.namaLengkap;
	}
	public void setnamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}
	
	// method nomorHp
	public char[] getNomorHP() {
		return nomorHP;
	}
	public void setnomorHP(char[] nomorHP) {
		this.nomorHP = nomorHP;
	}
	
	// method email
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
	// method kendaraan
	public int getkendaraan() {
		return kendaraan;
	}
	public void setkendaraan(int kendaraan) {
		this.kendaraan = kendaraan;
	}	
}