package ManajemenKaryawan;

/**
 * Data yang dimiliki oleh setiap admin
 */

public class AkunAdministrator
{
    private Registrasi dataRegistrasi = new Registrasi();                       // Admin punya nomor ID dan password
    private IdentitasAdmin dataIdentitasAdmin = new IdentitasAdmin();           // Admin punya identitas masing - masing
    private JadwalKerjaAdmin dataJadwalKerjaAdmin = new JadwalKerjaAdmin();     // Admin punya jadwal kerja yang sudah tersusun

    public AkunAdministrator(){}
    public AkunAdministrator(Registrasi dataRegistrasi, IdentitasAdmin dataIdentitasAdmin, JadwalKerjaAdmin dataJadwalKerjaAdmin)
    {
        this.dataRegistrasi = dataRegistrasi;
        this.dataIdentitasAdmin = dataIdentitasAdmin;
        this.dataJadwalKerjaAdmin = dataJadwalKerjaAdmin;
    }

    void setDataRegistrasi(Registrasi dataRegistrasi) {
        this.dataRegistrasi = dataRegistrasi;
    }

    void setDataIdentitasAdmin(IdentitasAdmin dataIdentitasAdmin) {
        this.dataIdentitasAdmin = dataIdentitasAdmin;
    }

    void setDataJadwalKerjaAdmin(JadwalKerjaAdmin dataJadwalKerjaAdmin) {
        this.dataJadwalKerjaAdmin = dataJadwalKerjaAdmin;
    }

    Registrasi getDataRegistrasi() {
        return this.dataRegistrasi;
    }

    IdentitasAdmin getDataIdentitasAdmin() {
        return this.dataIdentitasAdmin;
    }

    JadwalKerjaAdmin getDataJadwalKerjaAdmin() {
        return this.dataJadwalKerjaAdmin;
    }
}