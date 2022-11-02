import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        String password = "amazing123";
        while (true) {
            System.out.print("Type the password: ");
            String enteredPassword = new Scanner(System.in).nextLine();
            if (password.equals(enteredPassword)) {
                System.out.println("Right!");
                break;
            } else {
                System.err.println("Wrong!");
            }
        }
    }
}
