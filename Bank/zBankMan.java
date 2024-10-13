package Bank;
import java.util.ArrayList;
import java.util.Scanner;

public class zBankMan {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList <UserAccount> account = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("Wellcome");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Login();
                continue;
            } else if (choice == 2) {
                Register();
                continue;
            }
        }
    }


    private static void Login() {
        System.out.println("Enter Your Name: ");
        String name = scanner.next();
        for (UserAccount account: account) {
            if (account.getName().equals(name)){
                UserAccount newAcc = account;
                while (true) {
                    System.out.println("Enter Password: ");
                    String password = scanner.next();

                    if (password == newAcc.getPassword()) {
                        System.out.println("Authenticated!!");
                        break;
                    } else {
                        System.out.println("Incorrect password!!");
                        continue;
                    }
                }
            } else {
                System.out.println("Account not Found");
            }
        }
        

    }

    private static void Register() {
        System.out.println("Enter Name: ");
        String name = scanner.next();
        System.out.println("Enter Password: ");
        String password = scanner.next();
        
        UserAccount newAccount = new UserAccount(name, password);
        account.add(newAccount);
        System.out.println("Account registered Sucssufully for " + name);

    }
}
