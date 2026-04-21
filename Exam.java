public class Exam extends Assessment {

    private int numMissed;
    private int pointsEach;

    public Exam(String questionsInput, String missedInput) {
        try {
            int questions = Integer.parseInt(questionsInput);
            int missed = Integer.parseInt(missedInput);

            if (questions == 0) {
                throw new ArithmeticException("Number of questions cannot be zero.");
            }

            this.numMissed = missed;

            this.pointsEach = 100 / questions;

            int score = 100 - (missed * this.pointsEach);

            setScore(score);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values.");
            setScore(0);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            setScore(0);
        }
    }

    public int getNumMissed() {
        return this.numMissed;
    }

    public int getPointsEach() {
        return this.pointsEach;
    }
}