package ManajemenKaryawan;

public class AkunKaryawan 
{
    private Registrasi dataRegistrasi;
    private PenghasilanKaryawan dataPenghasilanKaryawan;
    private IdentitasKaryawan dataIdentitasKaryawan;
    private JadwalKerjaKaryawan dataJadwalKerjaKaryawan;

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