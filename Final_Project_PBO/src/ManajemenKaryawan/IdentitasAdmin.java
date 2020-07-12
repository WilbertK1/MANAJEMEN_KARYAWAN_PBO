package ManajemenKaryawan;

/**
 * @author Harris Siaputra (03082190009)
 */

public class IdentitasAdmin {
    private String namaLengkap;
    private String nomorHP;
    private String e_mail;

    public IdentitasAdmin(){}

    public IdentitasAdmin(String namaLengkap, String nomorHP, String e_mail){
        this.namaLengkap = namaLengkap;
        this.nomorHP = nomorHP;
        this.e_mail = e_mail;
    }

    public void setNamaLengkap(String namaLengkap){
        this.namaLengkap = namaLengkap;
    }

    public String getNamaLengkap(){
        return this.namaLengkap;
    }

    public void setNomorHP(String nomorHP){
        this.nomorHP = nomorHP;
    }

    public String getnomorhp(){
        return this.nomorHP;
    }

    public void setEmail(String e_mail){
        this.e_mail = e_mail;
    }

    public String getEmail(){
        return this.e_mail;
    }
}