package ManajemenKaryawan;

/**
 * Data rahasia yang digunakan dalam proses "Sign In", "Log In", dan "Sign Out"
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