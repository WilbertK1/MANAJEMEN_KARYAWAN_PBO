package ManajemenKaryawan;

public class AkunAdministrator
{
    private Registrasi dataRegistrasi;
    private IdentitasAdmin dataIdentitasAdmin;
    private JadwalKerjaAdmin dataJadwalKerjaAdmin;

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