class AverageOfGivenNumbers {

    // implement here again the method of exercise 43
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        // write your code here
        int sum = sum(number1, number2, number3, number4);

        return (double) sum / 4;
    }

    public static void main(String[] args) {
        double result = average(41, 55, 1, 12);
        System.out.println("Average: " + result);
    }
}
