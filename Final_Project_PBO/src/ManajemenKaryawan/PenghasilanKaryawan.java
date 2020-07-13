package ManajemenKaryawan;
import java.util.Date;

public class PenghasilanKaryawan
{
    private int totalPenghasilan;
    private Date jamMulaiKerja;
    private Date jamSelesaiKerja;
    private String statusKerja;
    private int jumlahHariKerja;
    private int lamaWaktuKerja;

    int penghasilanPerJam(String statusKerja)
    {
        int upahMinimum; // standar gaji per bulan (tergantung status kerjanya)
        int upahPerJam;  // jumlah upah/ gaji yang dihitung per jamnya

        if (statusKerja.equals("full time"))
        {
            // FULL TIME
            upahMinimum = 5000000;
            upahPerJam = upahMinimum / 173;
            return upahPerJam;
        }
        else if (statusKerja.equals("part time"))
        {
            // PART TIME
            upahMinimum = 2000000;
            upahPerJam = upahMinimum / 173;
            return upahPerJam;
        }
        else if (statusKerja.equals("internship"))
        {
            // INTERNSHIP
            upahMinimum = 3000000;
            upahPerJam = upahMinimum / 173;
            return upahPerJam;
        }
        else if (statusKerja.equals("freelance"))
        {
            // FREELANCE
            upahMinimum = 4000000;
            upahPerJam = upahMinimum / 173;
            return upahPerJam;
        }
        else {return 0;}
    }

    int calculate(AkunKaryawan dataAkunKaryawan)
    {
        // Isi = data jadwal kerja yang diproses oleh karyawan
        this.jamMulaiKerja = dataAkunKaryawan.getDataJadwalKerjaKaryawan().getJamMulaiKerja();
        this.jamSelesaiKerja = dataAkunKaryawan.getDataJadwalKerjaKaryawan().getJamSelesaiKerja();
        this.statusKerja = dataAkunKaryawan.getDataJadwalKerjaKaryawan().getStatusKerja();
        this.jumlahHariKerja = dataAkunKaryawan.getDataJadwalKerjaKaryawan().getJumlahHariKerja();

        // perbedaan jam mulai kerja dan jam selesai kerja

        this.totalPenghasilan = this.lamaWaktuKerja * this.jumlahHariKerja * penghasilanPerJam(statusKerja);
        return this.totalPenghasilan; // belum selesai
    }

    void display(AkunKaryawan dataAkunKaryawan)
    {
        // Isi = tampilkan Slip Gaji yang akan diterima pegawai/ karyawan
        System.out.println("Total diterima   = " + calculate(dataAkunKaryawan));
    }
}