package ManajemenKaryawan;
import java.util.Scanner;

public class AkunKaryawan {
    Registrasi dataRegistrasi;
    HitungGaji dataGaji;
    IdentitasKaryawan dataIdentitasKaryawan;
    JadwalKerjaKaryawan dataJadwalKerjaKaryawan;

    void interfaceMenu(String strEmployeeID)
    {
        Scanner InputValue = new Scanner(System.in);
        InputValue.close();
        System.out.println("================================================");
        System.out.println("Welcome, " + strEmployeeID + "!");
        System.out.println("================================================");

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

    void navigateOptions(String pilihan)
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

        }
        
        if (pilihan.equals(optionsList[6]) || pilihan.equals("7"))
        {

        }
        
        if (pilihan.equals(optionsList[7]) || pilihan.equals("0"))
        {

        }
    }
}