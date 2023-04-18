package latihan3;

public class GradedActivity {
    double score;
    String name;

    public GradedActivity(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
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
