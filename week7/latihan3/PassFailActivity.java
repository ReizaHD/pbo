package latihan3;

public class PassFailActivity extends GradedActivity{
    double minimumPassingScore;

    public PassFailActivity(String name, double minimumPassingScore) {
        super(name);
        this.minimumPassingScore = minimumPassingScore;
    }

    public char getGrade(){
        if(score>=85){
            return 'A';
        } else if(score>=75){
            return 'B';
        } else if(score>=65){
            return 'C';
        } else if(score>=55){
            return 'D';
        } else {
            return 'E';
        }
    }
}
