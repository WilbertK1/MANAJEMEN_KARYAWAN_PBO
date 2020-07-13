package ManajemenKaryawan;
import java.util.Scanner;

public class MenuAdministrator 
{
    static AkunAdministrator dataAkunAdministrator;
    static Scanner InputValue = new Scanner(System.in);

    static void interfaceMenu(String strEmployeeID)
    {
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

    static void navigateOptions(String option)
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

        if (option.equals(optionsList[0]) || option.equals("1"))
        {
            inputIdentitas();
        }
        else if (option.equals(optionsList[1]) || option.equals("2"))
        {

        }
        else if (option.equals(optionsList[2]) || option.equals("3"))
        {
            
        }
        else if (option.equals(optionsList[3]) || option.equals("4"))
        {
            
        }
        else if (option.equals(optionsList[4]) || option.equals("5"))
        {

        }
        else if (option.equals(optionsList[5]) || option.equals("6"))
        {

        }
        else if (option.equals(optionsList[6]) || option.equals("7"))
        {

        }
        else if (option.equals(optionsList[7]) || option.equals("0"))
        {

        }
    }

    static void inputIdentitas()
    {
        Scanner InputValue = new Scanner(System.in);
        System.out.println("1 >> Input Identitas");
        System.out.println("-------------------- \n");

        System.out.print("Nama Lengkap  = "); String inputNamaLengkap = InputValue.nextLine();
        System.out.print("Nomor HP      = "); String inputNomorHP = InputValue.nextLine();
        System.out.print("E-mail        = "); String inputEmail = InputValue.nextLine(); System.out.println();

        dataAkunAdministrator.setDataIdentitasAdmin(new IdentitasAdmin(inputNamaLengkap, inputNomorHP, inputEmail));
    }
}