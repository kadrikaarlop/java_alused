public class Multiplier {
    private int number;

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int otherNumber) {
        return otherNumber*number;
    }

    public static void main(String[] args) {
        Multiplier threeMultiplier = new Multiplier(2);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(3));
        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(5));

        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(6));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(7));
    }
}