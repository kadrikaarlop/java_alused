import java.util.Random;

class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String characters = "abcdefghijklmnopqrstuvwxyz";

        String password = "";
        int numberOfCharacters = this.length;

        while (numberOfCharacters > 0) {
            int luku = this.random.nextInt(characters.length());
            char c = characters.charAt(luku);
            password = password + c;
            numberOfCharacters--;
        }

        return password;
    }
}
