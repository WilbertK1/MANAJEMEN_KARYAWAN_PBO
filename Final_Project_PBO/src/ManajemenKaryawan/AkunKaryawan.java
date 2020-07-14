package ManajemenKaryawan;

public class AkunKaryawan
{
    private Registrasi dataRegistrasi;                      // Karyawan punya nomorID & password
    private PenghasilanKaryawan dataPenghasilanKaryawan;    // Karyawan punya data penghasilan per bulan
    private IdentitasKaryawan dataIdentitasKaryawan;        // Karyawan punya identitas masing - masing
    private JadwalKerjaKaryawan dataJadwalKerjaKaryawan;    // Karyawan punya jadwal kerja yang sudah tersusun

    public AkunKaryawan(){}
    public AkunKaryawan(Registrasi dataRegistrasi, PenghasilanKaryawan dataPenghasilanKaryawan, IdentitasKaryawan dataIdentitasKaryawan, JadwalKerjaKaryawan dataJadwalKerjaKaryawan)
    {
        this.dataRegistrasi = dataRegistrasi;
        this.dataPenghasilanKaryawan = dataPenghasilanKaryawan;
        this.dataIdentitasKaryawan = dataIdentitasKaryawan;
        this.dataJadwalKerjaKaryawan = dataJadwalKerjaKaryawan;
    }

    void setDataRegistrasi(Registrasi dataRegistrasi) {
        this.dataRegistrasi = dataRegistrasi;
    }

    void setDataPenghasilanKaryawan(PenghasilanKaryawan dataPenghasilanKaryawan) {
        this.dataPenghasilanKaryawan = dataPenghasilanKaryawan;
    }

    void setDataIdentitasKaryawan(IdentitasKaryawan dataIdentitasKaryawan) {
        this.dataIdentitasKaryawan = dataIdentitasKaryawan;
    }

    void setDataJadwalKerjaKaryawan(JadwalKerjaKaryawan dataJadwalKerjaKaryawan) {
        this.dataJadwalKerjaKaryawan = dataJadwalKerjaKaryawan;
    }

    Registrasi getDataRegistrasi() {
        return this.dataRegistrasi;
    }

    PenghasilanKaryawan getdataPenghasilanKaryawan() {
        return this.dataPenghasilanKaryawan;
    }

    IdentitasKaryawan getDataIdentitasKaryawan() {
        return this.dataIdentitasKaryawan;
    }

    JadwalKerjaKaryawan getDataJadwalKerjaKaryawan() {
        return this.dataJadwalKerjaKaryawan;
    }
}