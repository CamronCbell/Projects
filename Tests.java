import java.util.Scanner;

public class Tests 
{

    private double average;
    private int count;

    public Tests() 
    {
        average = 0;
        count = 0;
    }

    public void getAverage() 
    {

        Scanner scan = new Scanner(System.in);

        double sum = 0.0;
        count = 0;

        System.out.println("Enter test scores or -1 to quit");
        double score = scan.nextDouble();

        while (score != -1) {
            sum += score;
            count++;

            System.out.println("Enter test scores or -1 to quit");
            score = scan.nextDouble();
        }

        if (count > 0) {
            average = sum / count;
        } else {
            average = Double.NaN;
        }
    }

    // toString method
    public String toString() {
        return "The average of the " + count + " scores entered is " + String.format("%.2f", average) + ".";
    }
}