import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.print("Type a number: ");
        int luku = Integer.parseInt(reader.nextLine());

        System.out.println("");
        if (luku > 0) {
            System.out.println("The Number is positive.");
        } else {
            System.out.println("The Number is not positive.");
        }
    }
}
