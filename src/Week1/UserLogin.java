package Week1;
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String userName = "elif",password = "12345", enteredUserName, enteredPassword, newPassword;
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        enteredUserName = input.nextLine();
        System.out.print("Enter password: ");
        enteredPassword = input.nextLine();

        if(userName.equals(enteredUserName) && (password.equals(enteredPassword))){
            System.out.print("You have successfully logged in!");
        }
        else if(userName.equals(enteredUserName) && !(password.equals(enteredPassword))) {
            System.out.println("Password is incorrect!");
            System.out.print("Select 1 for setting new password.\nSelect 2 for exit.");
            num = input.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("Select a different password from the last password: ");
                    newPassword = input.next();
                    if (newPassword.equals(password)) {
                        System.out.print("Select different password!");
                    } else {
                        System.out.print("New password is accepted.");
                    }
                }
                case 2 -> System.out.print("Good bye!");
            }
        }
        else {
            System.out.print("You have entered WRONG information!");
        }
    }
}
