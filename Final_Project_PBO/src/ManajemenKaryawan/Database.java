package ManajemenKaryawan;
import java.util.LinkedList;

/**
 * Database.java = tempat dimana semua data tersimpan secara terpusat
 * Termasuk juga data karyawan, data admin, hingga data rahasia
 */

public class Database 
{
    private static LinkedList <Registrasi> daftarRegistrasi = new LinkedList<Registrasi>();
    private static LinkedList <AkunKaryawan> daftarAkunKaryawan = new LinkedList<AkunKaryawan>();
    private static LinkedList <AkunAdministrator> daftarAdministrator = new LinkedList<AkunAdministrator>();

    static void append(Registrasi dataRegistrasi)
    {
        // masukkan elemen ke LinkedList dataRegistrasi
        daftarRegistrasi.add(dataRegistrasi);
    }

    static void append(AkunKaryawan dataKaryawan) 
    {
        // masukkan elemen ke LinkedList dataKaryawan
        daftarAkunKaryawan.add(dataKaryawan);
    }

    static void append(AkunAdministrator dataAdministrator) 
    {
        // masukkan elemen ke LinkedList dataAdministrator
        daftarAdministrator.add(dataAdministrator);
    }

    static LinkedList <Registrasi> accessDaftarRegistrasi() 
    {
        // panggil LinkedList daftarRegistrasi
        return daftarRegistrasi;
    }

    static LinkedList <AkunKaryawan> accessDaftarKaryawan() 
    {
        // panggil LinkedList daftarKaryawan
        return daftarAkunKaryawan;
    }

    static LinkedList <AkunAdministrator> accessDaftarAdministrator() 
    {
        // panggil LinkedList daftarAdministrator
        return daftarAdministrator;
    }

    static AkunKaryawan aksesKaryawan(char[] nomorID)
    {
        // cari dan himpun data Karyawan berdasarkan ID mereka
        for (int urutanDaftar = 0; urutanDaftar < daftarAkunKaryawan.size(); urutanDaftar++)
        {
            if (daftarAkunKaryawan.get(urutanDaftar).getDataRegistrasi().getNomorID().equals(nomorID.toString())) {
                return daftarAkunKaryawan.get(urutanDaftar);
            }
            else if (!daftarAkunKaryawan.getLast().getDataRegistrasi().getNomorID().equals(nomorID.toString())) {
                System.out.println("Maaf, tidak ada karyawan dengan nomor ID tersebut.");
                System.out.println("Silakan cek nomor ID secara jelas dan terperinci.");
                return null;
            }
        }
    }

    static AkunAdministrator aksesAdmin(char[] nomorID)
    {
        // cari dan himpun data Administrator berdasarkan ID mereka
        for (int urutanDaftar = 0; urutanDaftar < daftarAdministrator.size(); urutanDaftar++)
        {
            if (daftarAdministrator.get(urutanDaftar).getDataRegistrasi().getNomorID().equals(nomorID.toString())) {
                return daftarAdministrator.get(urutanDaftar);
            }
            else if (!daftarAdministrator.getLast().getDataRegistrasi().getNomorID().equals(nomorID.toString())) {
                System.out.println("Maaf, tidak ada admin dengan nomor ID tersebut.");
                System.out.println("Silakan cek nomor ID secara jelas dan terperinci.");
                return null;
            }
        }
    }

    static void printKaryawan()
    {
        // tampilkan data Karyawan masing - masing dalam bentuk tabel
        for (int urutanDaftar = 0; urutanDaftar < daftarAkunKaryawan.size(); urutanDaftar++)
        {
            System.out.println("Karyawan " + (urutanDaftar + 1) + ": ");
            System.out.println("Status Kerja     = " + daftarAkunKaryawan.get(urutanDaftar).getDataJadwalKerjaKaryawan().getStatusKerja()); System.out.println();

            System.out.println("NIM Karyawan     = " + daftarAkunKaryawan.get(urutanDaftar).getDataRegistrasi().getNomorID().toString());
            System.out.println("Nama Lengkap     = " + daftarAkunKaryawan.get(urutanDaftar).getDataIdentitasKaryawan().getnamaLengkap());
            System.out.println("Nomor HP         = " + daftarAkunKaryawan.get(urutanDaftar).getDataIdentitasKaryawan().getNomorHP().toString());
            System.out.println("E-mail           = " + daftarAkunKaryawan.get(urutanDaftar).getDataIdentitasKaryawan().getemail());
            System.out.println("Jumlah Kendaraan = " + daftarAkunKaryawan.get(urutanDaftar).getDataIdentitasKaryawan().getkendaraan()); System.out.println();
        }
    }

    static void printAdmin()
    {
        // tampilkan data Administrator masing - masing dalam bentuk tabel
    }

    static void resetDaftarRegistrasi()
    {
        // hapus SEMUA elemen LinkedList daftarRegistrasi
        daftarRegistrasi.clear();
    }

    static void resetDaftarKaryawan()
    {
        // hapus SEMUA elemen LinkedList daftarKaryawan
        daftarAkunKaryawan.clear();
    }

    static void resetDaftarAdmin()
    {
        // hapus SEMUA elemen LinkedList daftarAdministrator
        daftarAdministrator.clear();
    }
}