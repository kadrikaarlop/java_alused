import java.util.Scanner;

class SumOfAges {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // read data
        // person 1
        System.out.print("Type your name: ");
        String firstName = reader.next();
        System.out.print("Type your age: ");
        int firstAge = reader.nextInt();
        System.out.println();
        // person 2
        System.out.print("Type your name: ");
        String secondName = reader.next();
        System.out.print("Type your age: ");
        int secondAge = reader.nextInt();
        System.out.println();
        // add data
        int total = firstAge + secondAge;
        // print
        System.out.println(firstName + " and " + secondName + " are " + total + " years old in total.");
    }
}
