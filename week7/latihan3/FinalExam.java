package latihan3;

public class FinalExam extends GradedActivity{
    int numberOfQuestion, numberMissed;
    double pointsPerQuestion;

    public FinalExam(String name, int numberOfQuestion, int numberMissed) {
        super(name);
        this.numberOfQuestion = numberOfQuestion;
        this.numberMissed = numberMissed;
    }

    public int getNumberMissed() {
        return numberMissed;
    }

    public double getPointsPerQuestion() {
        return pointsPerQuestion;
    }
}
