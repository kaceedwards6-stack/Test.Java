public class Exam extends Assessment {
    private double pointsEach;

    public Exam(int questions, int missed) {
        pointsEach = 100.0 / questions;
        double score = (questions - missed) * pointsEach;
        setScore((int) Math.round(score));
    }

    public double getPointsEach() {
        return pointsEach;
    }
}
