public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        int number = 2;

        while (number <= 100) {
            System.out.println(number);
            number = number + 2;
        }

        /* also the following would be possible. Here we go through all the numbers trom 1 to 100
         * but print only those that are even
        int number = 1;

        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }

            number++;
        }
        */

    }
}
