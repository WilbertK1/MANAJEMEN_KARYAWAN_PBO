package ManajemenKaryawan;

/**
 * Registrasi.java
 * Isi = data rahasia, seperti nomor ID dan password
 * Guna = untuk sign in, log in, dan sign out
 */

public class Registrasi {
	
    private char[] nomorID = new char[20];
    private char[] password = new char[20];

    public Registrasi(){}
    public Registrasi(char[] nomorID, char[] password)
    {
        this.nomorID = nomorID;
        this.password = password;
    }

    void setNomorID(char[] nomorID) {
        this.nomorID = nomorID;
    }

    void setPassword(char[] password) {
        this.password = password;
    }

    char[] getNomorID() {
        return nomorID;
    }

    char[] getPassword() {
        return password;
    }
}