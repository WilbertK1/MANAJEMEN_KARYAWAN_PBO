+package ManajemenKaryawan;
import java.util.ArrayList;
import java.util.LinkedList;
import ManajemenKaryawan.AkunAdministrator;
import ManajemenKaryawan.AkunKaryawan;

public class Database {
    private static LinkedList <Registrasi> daftarRegistrasi = new LinkedList<Registrasi>();
    private static LinkedList <AkunKaryawan> daftarAkunKaryawan = new LinkedList<AkunKaryawan>();
    private static LinkedList <AkunAdministrator> daftarAdministrator = new LinkedList<AkunAdministrator>();

    static void append(Registrasi dataRegistrasi) {
        daftarRegistrasi.add(dataRegistrasi);
    }

    static void append(AkunKaryawan dataKaryawan) {
        daftarAkunKaryawan.add(dataKaryawan);
    }

    static void append(AkunAdministrator dataAdministrator) {
        daftarAdministrator.add(dataAdministrator);
    }

    static void delete(Registrasi dataRegistrasi)
    {

    }

    static void delete(AkunKaryawan dataKaryawan)
    {

    }

    static void delete(AkunAdministrator dataAdministrator)
    {

    }

    static LinkedList <Registrasi> accessDaftarRegistrasi() {
        return daftarRegistrasi;
    }

    static LinkedList <AkunKaryawan> accessDaftarKaryawan() {
        return daftarAkunKaryawan;
    }

    static LinkedList <AkunAdministrator> accessDaftarAdministrator() {
        return daftarAdministrator;
    }

    static AkunKaryawan cariKaryawan(Registrasi dataRegistrasi)
    {

    }

    static AkunAdministrator cariAdmin(Registrasi dataRegistrasi)
    {

    }

    static void printKaryawan()
    {

    }

    static void printAdmin()
    {

    }

    static void hapusKaryawan()
    {

    }

    static void hapusAdmin()
    {

    }
}