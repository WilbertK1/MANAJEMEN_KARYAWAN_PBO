package ManajemenKaryawan;
import java.util.LinkedList;

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

    static void delete(Registrasi dataRegistrasi)
    {
        // hapus suatu elemen dari LinkedList daftarRegistrasi
        for (int urutanDaftar = 0; urutanDaftar < daftarRegistrasi.size(); urutanDaftar++)
        {
            // Apabila employeeID yang ingin dihapus = sudah ada di daftarRegistrasi
            if (daftarRegistrasi.get(urutanDaftar).getNomorID().equals(dataRegistrasi.getNomorID())) 
            {
                // hapus data tersebut dari LinkedList
                daftarRegistrasi.remove(urutanDaftar); break;
            }
            // Bila employeeID yang ingin dihapus = tidak tertera di daftarRegistrasi
            else if (daftarRegistrasi.getLast().getNomorID().equals(dataRegistrasi.getNomorID()))
            {
                // 
                System.out.println("Maaf, data tidak tercantum (undefined).");
                System.out.println("Mohon cek ulang penulisan data Anda. \n");
            }
        }
    }

    static void delete(AkunKaryawan dataKaryawan)
    {
        // hapus suatu elemen dari LinkedList daftarKaryawan
    }

    static void delete(AkunAdministrator dataAdministrator)
    {
        // hapus suatu elemen dari LinkedList daftarAdministrator
        
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
    }

    static AkunAdministrator aksesAdmin(char[] nomorID)
    {
        // cari dan himpun data Administrator berdasarkan ID mereka
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
    }
}