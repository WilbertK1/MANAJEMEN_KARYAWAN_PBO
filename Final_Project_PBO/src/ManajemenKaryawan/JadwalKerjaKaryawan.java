package ManajemenKaryawan;
import java.util.Date;

/**
 * @author Hubert Daniel Rusli (03082190024)
 */

public class JadwalKerjaKaryawan
{
    private Date jamMulaiKerja;
    private Date jamSelesaiKerja;
    private String statusKerja;
    private int jumlahHariKerja;

    public JadwalKerjaKaryawan(){}
    public JadwalKerjaKaryawan(Date jamMulaiKerja, Date jamSelesaiKerja, String statusKerja, int jumlahHariKerja)
    {
        this.jamMulaiKerja = jamMulaiKerja;
        this.jamSelesaiKerja = jamSelesaiKerja;
        this.statusKerja = statusKerja;
        this.jumlahHariKerja = jumlahHariKerja;
    }

    public void setJamMulaiKerja(Date jamMulaiKerja) {
        this.jamMulaiKerja = jamMulaiKerja;
    }

    public void setJamSelesaiKerja(Date jamSelesaiKerja) {
        this.jamSelesaiKerja = jamSelesaiKerja;
    }

    public void setStatusKerja(String statusKerja) {
        this.statusKerja = statusKerja;
    }

    public void setJumlahHariKerja(int jumlahHariKerja) {
        this.jumlahHariKerja = jumlahHariKerja;
    }

    public Date getJamMulaiKerja() {
        return this.jamMulaiKerja;
    }

    public Date getJamSelesaiKerja() {
        return this.jamSelesaiKerja;
    }

    public String getStatusKerja() {
        return this.statusKerja;
    }

    public int getJumlahHariKerja() {
        return this.jumlahHariKerja;
    }
}