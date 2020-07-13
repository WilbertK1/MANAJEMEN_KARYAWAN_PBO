package ManajemenKaryawan;

public class PenghasilanKaryawan
{
    private int totalPenghasilan;

    int calculate(JadwalKerjaKaryawan dataJadwalKerjaKaryawan)
    {
        // Isi = data jadwal kerja yang diproses oleh karyawan
        return this.totalPenghasilan; // belum selesai
    }

    void display(JadwalKerjaKaryawan dataJadwalKerjaKaryawan)
    {
        // Isi = tampilkan Slip Gaji yang akan diterima pegawai/ karyawan
        System.out.println("Total diterima   = " + calculate(dataJadwalKerjaKaryawan));
    }
}