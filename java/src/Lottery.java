import java.util.ArrayList;
import java.util.Random;

class Lottery {
    private ArrayList<Integer> numbers;

    public Lottery() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        while (this.numbers.size() < 7) {
            int newNumber = random.nextInt(39) + 1;
            boolean alreadyDrawn = this.containsNumber(newNumber);

            // we add the number only if it is not already among the drawn numbers
            if (!alreadyDrawn) {
                this.numbers.add(newNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        for (int n : this.numbers) {
            if (n == number) {
                return true;
            }
        }
        return false;
    }
}
