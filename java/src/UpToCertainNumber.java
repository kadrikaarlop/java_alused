import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Write your code here

        System.out.print("Up to what number? ");
        int last = Integer.parseInt(reader.nextLine());

        int number = 1;
        while (number <= last) {
            System.out.println(number);
            number++;
        }
    }
}
