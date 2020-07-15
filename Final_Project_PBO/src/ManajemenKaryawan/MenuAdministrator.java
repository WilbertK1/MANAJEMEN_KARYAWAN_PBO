package ManajemenKaryawan;
import java.util.Scanner;

/**
 * User interface dalam setiap "Log In" admin
 */

public class MenuAdministrator
{
    static AkunAdministrator dataAkunAdministrator;
    static Scanner InputValue = new Scanner(System.in);

    static void interfaceMenu()
    {
        System.out.println("---------------------------------------------------");
        System.out.println("Welcome, " + String.copyValueOf(dataAkunAdministrator.getDataRegistrasi().getNomorID()) + "!");
        System.out.println("---------------------------------------------------");

        System.out.println("========================================");
        System.out.println("1 >> Input Identitas                    ");
        System.out.println("2 >> Input Jam Kerja                    ");
        System.out.println("3 >> Tampilkan Gaji Karyawan            ");
        System.out.println("4 >> Ubah Identitas                     ");
        System.out.println("5 >> Ubah Jam Kerja                     ");
        System.out.println("6 >> Tampilkan Identitas                ");
        System.out.println("7 >> Tampilkan Jam Kerja                \n");

        System.out.println("8 >> Tampilkan Data Karyawan            ");
        System.out.println("9 >> Tampilkan Data Administrator       ");
        System.out.println("0 >> Log Out                            ");
        System.out.println("========================================\n");

        System.out.print("Pilihan Menu: "); String option = InputValue.nextLine();
        System.out.println(); navigateOptions(option);
    }

    static void navigateOptions(String option)
    {
        if (option.equals("input identitas") || option.equals("1"))
        {
            // input identitas admin
            inputIdentitas();
            interfaceMenu();
        }
        else if (option.equals("input jam kerja") || option.equals("2"))
        {
            // input jam kerja admin
            interfaceMenu();
        }
        else if (option.equals("tampilkan gaji karyawan") || option.equals("3"))
        {
            // hitung gaji karyawan
            tampilkanGajiKaryawan();
            interfaceMenu();
        }
        else if (option.equals("ubah identitas") || option.equals("4"))
        {
            // ubah identitas admin
            ubahIdentitas();
            interfaceMenu();
        }
        else if (option.equals("ubah jam kerja") || option.equals("5"))
        {
            // ubah jam kerja admin
            interfaceMenu();
        }
        else if (option.equals("tampilkan identitas") || option.equals("6"))
        {
            // tampilkan identitas admin
            tampilkanIdentitas();
            interfaceMenu();
        }
        else if (option.equals("tampilkan jam kerja") || option.equals("7"))
        {
            // tampilkan jam kerja admin
            interfaceMenu();
        }
        else if (option.equals("tampilkan data karyawan") || option.equals("8"))
        {
            tampilkanDataKaryawan();
            interfaceMenu();
        }
        else if (option.equals("tampilkan data administrator") || option.equals("9"))
        {
            tampilkanDataAdministrator();
            interfaceMenu();
        }
        else if (option.equals("log out") || option.equals("0"))
        {
            // keluar dari akun admin
            LogOut();
        }
    }

    static void inputIdentitas()
    {
        System.out.println("1 >> Input Identitas");
        System.out.println("-------------------- \n");

        System.out.print("Nama Lengkap  = "); String inputNamaLengkap = InputValue.nextLine();
        System.out.print("Nomor HP      = "); String inputNomorHP = InputValue.nextLine();
        System.out.print("E-mail        = "); String inputEmail = InputValue.nextLine(); System.out.println();

        dataAkunAdministrator.setDataIdentitasAdmin(new IdentitasAdmin(inputNamaLengkap, inputNomorHP, inputEmail));
        InputValue.close();
    }

    static void tampilkanGajiKaryawan()
    {
        for (int urutanDaftar = 0; urutanDaftar < Database.accessDaftarKaryawan().size(); urutanDaftar++)
        {
            System.out.println("---------------------------------------------");
            System.out.println("Karyawan No." + (urutanDaftar + 1) + ": ");
            System.out.println("Nomor ID        = " + Database.accessDaftarKaryawan().get(urutanDaftar).getDataRegistrasi().getNomorID().toString());
            System.out.println("Nama Lengkap    = " + Database.accessDaftarKaryawan().get(urutanDaftar).getDataIdentitasKaryawan().getnamaLengkap());
            System.out.println("Total Gaji      = " + Database.accessDaftarKaryawan().get(urutanDaftar).getdataPenghasilanKaryawan().calculate(Database.accessDaftarKaryawan().get(urutanDaftar)));
            System.out.println("--------------------------------------------- \n");
        }
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
                case 1: // Hanya ubah nama Lengkap saja
                    System.out.println("Nama Lengkap (old) = " + dataAkunAdministrator.getDataIdentitasAdmin().getNamaLengkap());
                    System.out.print("Nama Lengkap (new) = "); String inputNamaLengkapBaru = InputValue.nextLine();

                    dataAkunAdministrator.getDataIdentitasAdmin().setNamaLengkap(inputNamaLengkapBaru);
                    perubahanIdentitas = true; break;

                case 2: // Hanya ubah nomor HP saja
                    System.out.println("Nomor HP (lama) = " + dataAkunAdministrator.getDataIdentitasAdmin().getnomorhp());
                    System.out.print("Nomor HP (baru) = "); String inputNomorHPBaru = InputValue.nextLine();

                    dataAkunAdministrator.getDataIdentitasAdmin().setNomorHP(inputNomorHPBaru);
                    perubahanIdentitas = true; break;

                case 3: // Hanya ubah alamat e-mail saja
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

        System.out.println("ID Administrator = " + dataAkunAdministrator.getDataRegistrasi().getNomorID().toString());
        System.out.println("Nama Lengkap     = " + dataAkunAdministrator.getDataIdentitasAdmin().getNamaLengkap());
        System.out.println("Nomor HP         = " + dataAkunAdministrator.getDataIdentitasAdmin().getnomorhp());
        System.out.println("Alamat e-mail    = " + dataAkunAdministrator.getDataIdentitasAdmin().getEmail());
        System.out.println();
        
        System.out.print("Please select any key to continue... "); String pause = InputValue.nextLine();
        InputValue.close();
    }

    static void tampilkanDataKaryawan()
    {
        System.out.println("8 >> Tampilkan Data Karyawan");
        System.out.println("---------------------------- \n");

        for (int urutanDaftar = 0; urutanDaftar < Database.accessDaftarKaryawan().size(); urutanDaftar++)
        {
            System.out.println("==========================================================");
            System.out.println("Karyawan No. " + (urutanDaftar + 1) + ": ");
            System.out.println("Nomor ID        = " + Database.accessDaftarKaryawan().get(urutanDaftar).getDataRegistrasi().getNomorID().toString());
            System.out.println("Nama Lengkap    = " + Database.accessDaftarKaryawan().get(urutanDaftar).getDataIdentitasKaryawan().getnamaLengkap());
            System.out.println("Status Kerja    = " + Database.accessDaftarKaryawan().get(urutanDaftar).getDataJadwalKerjaKaryawan().getStatusKerja());
            System.out.println("==========================================================");
        }
    }

    static void tampilkanDataAdministrator()
    {
        System.out.println("9 >> Tampilkan Data Administrator");
        System.out.println("--------------------------------- \n");

        for (int urutanDaftar = 0; urutanDaftar < Database.accessDaftarAdministrator().size(); urutanDaftar++)
        {
            System.out.println("==========================================================");
            System.out.println("Administrator No. " + (urutanDaftar + 1) + ": ");
            System.out.println("Nomor ID        = " + Database.accessDaftarAdministrator().get(urutanDaftar).getDataRegistrasi().getNomorID().toString());
            System.out.println("Nama Lengkap    = " + Database.accessDaftarAdministrator().get(urutanDaftar).getDataIdentitasAdmin().getNamaLengkap());
            System.out.println("Status Kerja    = " + Database.accessDaftarAdministrator().get(urutanDaftar).getDataJadwalKerjaAdmin().getStatusKerja());
            System.out.println("==========================================================");
        }
    }

    static void LogOut()
    {
        System.out.println("0 >> Log Out");
        System.out.println("------------ \n");

        System.out.print("Please select any key to continue... "); String pause = InputValue.nextLine();
        System.out.println(); App.interfaceMenu();
    }

    static void tampilkanGajiKaryawan()
    {
        for (int urutanDaftar = 0; urutanDaftar < Database.accessDaftarKaryawan().size(); urutanDaftar++)
        {
            System.out.println("---------------------------------------------");
            System.out.println("Karyawan No." + (urutanDaftar + 1) + ": ");
            System.out.println("Nomor ID        = " + Database.accessDaftarKaryawan().get(urutanDaftar).getDataRegistrasi().getNomorID().toString());
            System.out.println("Nama Lengkap    = " + Database.accessDaftarKaryawan().get(urutanDaftar).getDataIdentitasKaryawan().getnamaLengkap());
            System.out.println("Total Gaji      = " + Database.accessDaftarKaryawan().get(urutanDaftar).getdataPenghasilanKaryawan().calculate(Database.accessDaftarKaryawan().get(urutanDaftar)));
            System.out.println("--------------------------------------------- \n");
        }
    }

    static void ubahIdentitas()
    {
        boolean perubahanIdentitas = false;
        do
        {
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
                case 1: // Hanya ubah nama Lengkap saja
                    System.out.println("Nama Lengkap (old) = " + dataAkunAdministrator.getDataIdentitasAdmin().getNamaLengkap());
                    System.out.print("Nama Lengkap (new) = "); String inputNamaLengkapBaru = InputValue.nextLine();

                    dataAkunAdministrator.getDataIdentitasAdmin().setNamaLengkap(inputNamaLengkapBaru);
                    perubahanIdentitas = true; break;

                case 2: // Hanya ubah nomor HP saja
                    System.out.println("Nomor HP (lama) = " + dataAkunAdministrator.getDataIdentitasAdmin().getnomorhp());
                    System.out.print("Nomor HP (baru) = "); String inputNomorHPBaru = InputValue.nextLine();

                    dataAkunAdministrator.getDataIdentitasAdmin().setNomorHP(inputNomorHPBaru);
                    perubahanIdentitas = true; break;

                case 3: // Hanya ubah alamat e-mail saja
                    System.out.println("Alamat e-mail (old) = " + dataAkunAdministrator.getDataIdentitasAdmin().getEmail());
                    System.out.print("Alamat e-mail (new) = "); String inputEmailBaru = InputValue.nextLine();

                    dataAkunAdministrator.getDataIdentitasAdmin().setEmail(inputEmailBaru);
                    perubahanIdentitas = true; break;

                default:
                    System.out.println("Pilihan yang Anda input tidak tertera.");
                    System.out.println("Pilihan hanya dari 1 - 3");
            }
        } while (perubahanIdentitas == false);
    }

    static void tampilkanIdentitas()
    {
        System.out.println("6 >> Tampilkan Identitas");
        System.out.println("------------------------ \n");

        System.out.println("ID Administrator = " + dataAkunAdministrator.getDataRegistrasi().getNomorID().toString());
        System.out.println("Nama Lengkap     = " + dataAkunAdministrator.getDataIdentitasAdmin().getNamaLengkap());
        System.out.println("Nomor HP         = " + dataAkunAdministrator.getDataIdentitasAdmin().getnomorhp());
        System.out.println("Alamat e-mail    = " + dataAkunAdministrator.getDataIdentitasAdmin().getEmail());
        System.out.println();
        
        System.out.print("Please select any key to continue... "); String pause = InputValue.nextLine();
    }

    static void tampilkanDataKaryawan()
    {
        System.out.println("8 >> Tampilkan Data Karyawan");
        System.out.println("---------------------------- \n");

        for (int urutanDaftar = 0; urutanDaftar < Database.accessDaftarKaryawan().size(); urutanDaftar++)
        {
            System.out.println("==========================================================");
            System.out.println("Karyawan No. " + (urutanDaftar + 1) + ": ");
            System.out.println("Nomor ID        = " + String.copyValueOf(Database.accessDaftarAdministrator().get(urutanDaftar).getDataRegistrasi().getNomorID()));
            System.out.println("Nama Lengkap    = " + Database.accessDaftarKaryawan().get(urutanDaftar).getDataIdentitasKaryawan().getnamaLengkap());
            System.out.println("Status Kerja    = " + Database.accessDaftarKaryawan().get(urutanDaftar).getDataJadwalKerjaKaryawan().getStatusKerja());
            System.out.println("==========================================================");
        }
    }

    static void tampilkanDataAdministrator()
    {
        System.out.println("9 >> Tampilkan Data Administrator");
        System.out.println("--------------------------------- \n");

        for (int urutanDaftar = 0; urutanDaftar < Database.accessDaftarAdministrator().size(); urutanDaftar++)
        {
            System.out.println("==========================================================");
            System.out.println("Administrator No. " + (urutanDaftar + 1) + ": ");
            System.out.println("Nomor ID        = " + String.copyValueOf(Database.accessDaftarAdministrator().get(urutanDaftar).getDataRegistrasi().getNomorID()));
            System.out.println("Nama Lengkap    = " + Database.accessDaftarAdministrator().get(urutanDaftar).getDataIdentitasAdmin().getNamaLengkap());
            System.out.println("Status Kerja    = " + Database.accessDaftarAdministrator().get(urutanDaftar).getDataJadwalKerjaAdmin().getStatusKerja());
            System.out.println("==========================================================");
        }
    }

    static void LogOut()
    {
        String[] argumentsList = {"1", "2", "3"};
        System.out.println("0 >> Log Out");
        System.out.println("------------ \n");

        System.out.print("Please select any key to continue... "); String pause = InputValue.nextLine();
        System.out.println(); App.main(argumentsList);
    }
}