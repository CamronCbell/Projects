/**
 * This class determines the grade for an exam.
 */
public class Exam extends Assessment {

    private int numMissed;
    private int pointsEach;

    /**
     * Constructor sets number of questions and number missed.
     * @param questions The number of questions.
     * @param missed The number of questions missed.
     */
    public Exam(int questions, int missed) {
        this.numMissed = missed;

        // Calculate points per question
        this.pointsEach = 100 / questions;

        // Calculate score
        int score = 100 - (missed * this.pointsEach);

        // Store score in parent class
        setScore(score);
    }

    /**
     * Returns number of questions missed.
     */
    public int getNumMissed() {
        return this.numMissed;
    }

    /**
     * Returns points each question is worth.
     */
    public int getPointsEach() {
        return this.pointsEach;
    }
}