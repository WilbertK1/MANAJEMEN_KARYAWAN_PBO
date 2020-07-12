package ManajemenKaryawan;

public class Registrasi {
	
    private char[] employeeID = new char[20];
    private char[] password = new char[20];

    Registrasi(){}
    Registrasi(char[] employeeID, char[] password)
    {
        this.employeeID = employeeID;
        this.password = password;
    }

    void setEmployeeID(char[] employeeID)
    {
        this.employeeID = employeeID;
    }

    void setPassword(char[] password)
    {
        this.password = password;
    }

    char[] getEmployeeID()
    {
        return employeeID;
    }

    char[] getPassword()
    {
        return password;
    }
}