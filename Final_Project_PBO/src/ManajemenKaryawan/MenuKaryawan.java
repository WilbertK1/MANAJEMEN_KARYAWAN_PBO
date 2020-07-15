package ManajemenKaryawan;
import java.util.Scanner;
import ManajemenKaryawan.AkunKaryawan;

public class MenuKaryawan 
{
    /**
     * cuma gabungkan fini ini ke file AkunKaryawan 
     */
    static AkunKaryawan dataAkunKaryawan;
    static Scanner InputValue = new Scanner(System.in);

    static void interfaceMenu()
    {
        System.out.println("------------------------------  ");
        System.out.println("1 >> Input Identitas            ");
        System.out.println("2 >> Input Jam Kerja            ");
        System.out.println("3 >> Hitung Gaji                ");
        System.out.println("4 >> Ubah Identitas             ");
        System.out.println("5 >> Ubah Jam Kerja             ");
        System.out.println("6 >> Tampilkan Identitas        ");
        System.out.println("7 >> Tampilkan Jam Kerja        ");
        System.out.println("0 >> Log Out                    ");
        System.out.println("------------------------------\n");

        System.out.print("Pilihan Menu: "); String option = InputValue.nextLine();
        navigateOptions(option);
    }

    static void navigateOptions(String pilihan)
    {
        String[] optionsList = new String[10];
        optionsList[0] = "input identitas";
        optionsList[1] = "input jam kerja";
        optionsList[2] = "hitung gaji";
        optionsList[3] = "ubah identitas";
        optionsList[4] = "ubah jam kerja";
        optionsList[5] = "tampilkan identitas";
        optionsList[6] = "tampilkan jam kerja";
        optionsList[7] = "log out";

        if (pilihan.equals(optionsList[0]) || pilihan.equals("1"))
        {
            inputIdentitas();
        }

        if (pilihan.equals(optionsList[1]) || pilihan.equals("2"))
        {
            inputJamKerja();
        }
        
        if (pilihan.equals(optionsList[2]) || pilihan.equals("3"))
        {
            hitungGaji();
        }
        
        if (pilihan.equals(optionsList[3]) || pilihan.equals("4"))
        {
            ubahIdentitas();
        }
        
        if (pilihan.equals(optionsList[4]) || pilihan.equals("5"))
        {
            ubahJamKerja();
        }
        
        if (pilihan.equals(optionsList[5]) || pilihan.equals("6"))
        {
            tampilkanIdentitas();
        }
        
        if (pilihan.equals(optionsList[6]) || pilihan.equals("7"))
        {
            tampilkanJamKerja();
        }
        
        if (pilihan.equals(optionsList[7]) || pilihan.equals("0"))
        {
            LogOut();
        }
    }

    static void inputIdentitas()
    {
        return dataIdentitasKaryawan;
    }

    static void inputJamKerja()
    {
        return dataJadwalKerjaKaryawan;
    }

    static void hitungGaji()
    {
        return dataPenghasilanKaryawan;
    }

    static void ubahIdentitas()
    {
        return dataRegistrasi;
    }

    static void ubahJamKerja()
    {
        return dataJadwalKerjaKaryawan;
    }

    static void tampilkanIdentitas()
    {
        AkunKaryawan.dataIdentitasKaryawan();
    }

    static void tampilkanJamKerja()
    {
        AkunKaryawan.dataJadwalKerjaKaryawan;
    }

    static void LogOut()
    {
        App.main(null);
    }

    /**
     * @author Albert Cenderawan (03082190015)
     * Pull git on 11/07/2020 - 12.13
     */
}