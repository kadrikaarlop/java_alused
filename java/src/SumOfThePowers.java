import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int result = 0;

        int number = 0;
        while (number <= n) {
            int power = (int) Math.pow(2, number);
            result += power;
            number++;
        }

        System.out.println("The result is " + result);

    }
}
