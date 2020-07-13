import java.util.Scanner;

public class App {
    static Registrasi dataRegistrasi;
    static AkunKaryawan dataAkunKaryawan;
    static AkunAdministrator dataAkunAdministator;

    public static void main(String[] args)
    {
        Scanner InputValue = new Scanner(System.in); 
        interfaceMenu();

        System.out.print("Pilihan menu: "); String option = InputValue.nextLine();
        navigateOptions(option); InputValue.close();
    }

    static void interfaceMenu()
    {
        System.out.println("==========================");
        System.out.println("Employee Management System");
        System.out.println("Final Project OOP 19IT2   ");
        System.out.println("========================== \n");

        System.out.println("--------------------------   ");
        System.out.println("1 >> Sign In                 ");
        System.out.println("2 >> Log In                  ");
        System.out.println("3 >> Sign Out                ");
        System.out.println("4 >> Feedback                ");
        System.out.println("5 >> About                   ");
        System.out.println("0 >> Exit                    ");
        System.out.println("-------------------------- \n");
    }

    public static void navigateOptions(String option)
    {
        String[] optionsList = new String[10];
        optionsList[0] = "sign in";     // daftar akun baru
        optionsList[1] = "log in";      // masuk ke akun tertentu
        optionsList[2] = "sign out";    // hapus sebuah akun
        optionsList[3] = "feedback";    // beri saran dan aspirasi
        optionsList[4] = "about";       // informasi program
        optionsList[5] = "exit";        // keluar dari program

        if (option.equals(optionsList[0]) || option.equals("1"))
        {
            SignIn();
        }
        else if (option.equals(optionsList[1]) || option.equals("2"))
        {
            LogIn();
        }
        else if (option.equals(optionsList[2]) || option.equals("3"))
        {
            SignOut();
        }
        else if (option.equals(optionsList[3]) || option.equals("4"))
        {
            Feedback();
        }
        else if (option.equals(optionsList[4]) || option.equals("5"))
        {
            aboutProgram();
        }
        else if (option.equals(optionsList[5]) || option.equals("0"))
        {
            Exit();
        }
    }

    private static void SignIn()
    {
        // Belum Selesai (by 03082190015)
        Scanner InputValue = new Scanner(System.in);
        String strNomorID, strPassword, strConfirmPassword;
        System.out.println("====================");
        System.out.println("1 >> Sign In \n");

        while (true)
        {
            System.out.print("Employee ID      = "); strNomorID = InputValue.nextLine();
            System.out.print("Password         = "); strPassword = InputValue.nextLine();
            System.out.print("Confirm Password = "); strConfirmPassword = InputValue.nextLine(); System.out.println();

            if (!strConfirmPassword.equals(strPassword))
            {
                System.out.println("Maaf, data Anda mengalami kesalahan.");
                System.out.println("Silakan input data Anda kembali. \n");
            }
            else if (strConfirmPassword.equals(strPassword))
            {
                System.out.println("Data Anda telah terkirim.");
                System.out.println("Silakan Log In akun Anda.");
                System.out.println("======================== \n");
                break;
            }
        }

        dataRegistrasi = new Registrasi(strNomorID.toCharArray(), strPassword.toCharArray());
        Database.append(dataRegistrasi);

        if (strNomorID.substring(0, 2).equals("01"))
        {
            dataAkunKaryawan = new AkunKaryawan();
        }
        else if (strNomorID.substring(0, 2).equals("02"))
        {
            dataAkunAdministator = new AkunAdministrator();
        }

        String[] arguments = {"1", "2", "3"};
        InputValue.close(); main(arguments);
    }

    private static void LogIn()
    {
        // Belum Selesai (by 03082190015)
        Scanner InputValue = new Scanner(System.in);
        String strNomorID, strPassword;

        while (true)
        {
            System.out.println("====================");
            System.out.println("2 >> Log In \n");

            System.out.print("Employee ID = "); strNomorID = InputValue.nextLine();
            System.out.print("Password    = "); strPassword = InputValue.nextLine(); System.out.println();

            if (!nomorID_isExist(strNomorID)) {
                System.out.println("Incorrect employee ID.");
            }
            if (!password_isExist(strPassword)) {
                System.out.println("Incorrect password.");
            }

            if (nomorID_isExist(strNomorID) && password_isExist(strPassword)) 
            { 
                System.out.println("==================== \n"); 
                break;
            }
            System.out.println();
        }
        
        InputValue.close();
    }

    private static boolean nomorID_isExist(String strNomorID)
    {
        // Mengecek apakah nomorID yang diinput sudah ada di LinkedList atau tidak (by 03082190015)
        for (int urutanDaftar = 0; urutanDaftar < Database.accessDaftarRegistrasi().size(); urutanDaftar++)
        {
            if (Database.accessDaftarRegistrasi().get(urutanDaftar).getNomorID().equals(strNomorID.toCharArray())) {return true;}
        }
        return false;
    }

    private static boolean password_isExist(String strPassword)
    {
        // Mengecek apakah password yang diinput sudah ada di LinkedList atau tidak (by 03082190015)
        for (int urutanDaftar = 0; urutanDaftar < Database.accessDaftarRegistrasi().size(); urutanDaftar++)
        {
            if (Database.accessDaftarRegistrasi().get(urutanDaftar).getPassword().equals(strPassword.toCharArray())) {return true;}
        }
        return false;
    }

    private static void SignOut()
    {
        // Belum Selesai (by 03082190015)
        System.out.println("====================");
        System.out.println("3 >> Sign Out \n");

        System.out.println("==================== \n");
    }

    private static void Feedback()
    {
        // Belum Selesai (by 03082190015)
        System.out.println("====================");
        System.out.println("4 >> Feedback \n");

        
        System.out.println("==================== \n");
    }

    private static void aboutProgram()
    {
        // Belum Selesai (by 03082190015)

        System.out.println("====================");
        System.out.println("5 >> About \n");

        System.out.println("Kelompok 3");
        System.out.println("==================== \n");
    }

    private static void Exit()
    {
        // Belum Selesai (by 03082190015)
        System.out.println("====================");
        System.out.println("0 >> Exit \n");

        System.out.print("Apakah Anda ingin keluar?");
        System.out.println("==================== \n");
    }
}