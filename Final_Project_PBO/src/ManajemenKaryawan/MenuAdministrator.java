package ManajemenKaryawan;
import java.util.Scanner;

public class MenuAdministrator 
{
    static AkunAdministrator dataAkunAdministrator;
    static Scanner InputValue = new Scanner(System.in);

    static void interfaceMenu()
    {
        System.out.println("================================================");
        System.out.println("Welcome, " + dataAkunAdministrator.getDataRegistrasi().getNomorID().toString() + "!");
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
            // input identitas admin
            inputIdentitas();
            interfaceMenu();
        }
        else if (option.equals(optionsList[1]) || option.equals("2"))
        {
            // input jam kerja admin
            interfaceMenu();
        }
        else if (option.equals(optionsList[2]) || option.equals("3"))
        {
            // hitung gaji karyawan
            interfaceMenu();
        }
        else if (option.equals(optionsList[3]) || option.equals("4"))
        {
            // ubah identitas admin
            ubahIdentitas();
            interfaceMenu();
        }
        else if (option.equals(optionsList[4]) || option.equals("5"))
        {
            // ubah jam kerja admin
            interfaceMenu();
        }
        else if (option.equals(optionsList[5]) || option.equals("6"))
        {
            // tampilkan identitas admin
            tampilkanIdentitas();
            interfaceMenu();
        }
        else if (option.equals(optionsList[6]) || option.equals("7"))
        {
            // tampilkan jam kerja admin
            interfaceMenu();
        }
        else if (option.equals(optionsList[7]) || option.equals("0"))
        {
            // keluar dari akun admin
            LogOut();
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
        InputValue.close();
    }

    static void ubahIdentitas()
    {
        boolean perubahanIdentitas = false;
        do
        {
            Scanner InputValue = new Scanner(System.in);
            System.out.println("4 >> Ubah Identitas");
            System.out.println("------------------- \n");
            
            System.out.println("===================");
            System.out.println("1. Nama Lengkap    ");
            System.out.println("2. Nomor HP        ");
            System.out.println("3. Alamat E-mail   ");
            System.out.println("=================== \n");

            System.out.print("Bagian yang ingin diubah = "); int pilihan = InputValue.nextInt(); InputValue.nextLine();
            System.out.println();
            
            switch (pilihan)
            {
                case 1:
                    System.out.println("Nama Lengkap (old) = " + dataAkunAdministrator.getDataIdentitasAdmin().getNamaLengkap());
                    System.out.print("Nama Lengkap (new) = "); String inputNamaLengkapBaru = InputValue.nextLine();

                    dataAkunAdministrator.getDataIdentitasAdmin().setNamaLengkap(inputNamaLengkapBaru);
                    perubahanIdentitas = true; break;
                case 2:
                    System.out.println("Nomor HP (lama) = " + dataAkunAdministrator.getDataIdentitasAdmin().getnomorhp());
                    System.out.print("Nomor HP (baru) = "); String inputNomorHPBaru = InputValue.nextLine();

                    dataAkunAdministrator.getDataIdentitasAdmin().setNomorHP(inputNomorHPBaru);
                    perubahanIdentitas = true; break;
                case 3:
                    System.out.println("Alamat e-mail (old) = " + dataAkunAdministrator.getDataIdentitasAdmin().getEmail());
                    System.out.print("Alamat e-mail (new) = "); String inputEmailBaru = InputValue.nextLine();

                    dataAkunAdministrator.getDataIdentitasAdmin().setEmail(inputEmailBaru);
                    perubahanIdentitas = true; break;
                default:
                    System.out.println("Pilihan yang Anda input tidak tertera.");
                    System.out.println("Pilihan hanya dari 1 - 3");
            }
            InputValue.close();
        } while (perubahanIdentitas == false);
    }

    static void tampilkanIdentitas()
    {
        Scanner InputValue = new Scanner(System.in);
        System.out.println("6 >> Tampilkan Identitas");
        System.out.println("------------------------ \n");

        System.out.println("==========================================================================");
        System.out.println("WARNING >> Data Privacy");
        System.out.println("Jangan berikan informasi berharga kepada orang lain.");
        System.out.println("Semua tindak penyalahgunaan data berada di luar tanggung jawab perusahaan.");
        System.out.println("========================================================================== \n");
        
        System.out.println("ID Administrator = " + dataAkunAdministrator.getDataRegistrasi().getNomorID());
        System.out.println("Nama Lengkap     = " + dataAkunAdministrator.getDataIdentitasAdmin().getNamaLengkap());
        System.out.println("Nomor HP         = " + dataAkunAdministrator.getDataIdentitasAdmin().getnomorhp());
        System.out.println("Alamat e-mail    = " + dataAkunAdministrator.getDataIdentitasAdmin().getEmail());
        System.out.println();
        
        System.out.print("Please select any key to continue... "); String pause = InputValue.nextLine();
        InputValue.close();
    }

    static void LogOut()
    {
        System.out.println("0 >> Log Out");
        System.out.println("------------ \n");

        System.out.print("Please select any key to continue... "); String pause = InputValue.nextLine();
        System.out.println(); App.interfaceMenu();
    }
}