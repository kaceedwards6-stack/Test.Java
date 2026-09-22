import java.util.Scanner;

public class Tests {
    private int count;
    private double average;

    public Tests() {
        count = 0;
        average = Double.NaN;
    }

    public void getAverage() {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int countScores = 0;

        System.out.println("Enter test scores (enter -1 to quit):");
        double score = input.nextDouble();

        while (score != -1) {
            sum += score;
            countScores++;

            System.out.println("Enter test scores (enter -1 to quit):");
            score = input.nextDouble();
        }

        count = countScores;
        average = sum / count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("The average of the %d scores entered is %.2f.", count, average);
    }
}
