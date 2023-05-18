
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Password password = new Password();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a password: ");
        String Password = scan.nextLine();
        String EncryptedPassword = password.EncryptPassword(Password);
        System.out.println("Your password is " + EncryptedPassword);
        scan.close();
    }

    public String EncryptPassword( String Password ) {
        String EncryptedPassword = "";
        while (EncryptedPassword.length() < Password.length()) {
            EncryptedPassword += "*";
        }
        return EncryptedPassword;
    }
}
