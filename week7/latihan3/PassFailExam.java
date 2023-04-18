package latihan3;

public class PassFailExam extends PassFailActivity{
    int numberOfQuestion, numberMissed;
    double pointsPerQuestion;

    public PassFailExam(String name, double minimumPassingScore, int numberOfQuestion, int numberMissed) {
        super(name, minimumPassingScore);
        this.numberOfQuestion = numberOfQuestion;
        this.numberMissed = numberMissed;
        this.pointsPerQuestion = pointsPerQuestion;
    }

    double getPointsEach(){
        return pointsPerQuestion;
    }

    public int getNumberMissed() {
        return numberMissed;
    }
}
