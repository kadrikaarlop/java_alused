import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();

        // NOTE: This solution would be quite ugly should there be more users.
        // In the following weeks we'll see how to do this better.
        if ((username.equals("alex") && password.equals("mightyducks")) ||
                (username.equals("emily") && password.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}


