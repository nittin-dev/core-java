package Interface;

 interface ScoringInterface {
    void addScore(int points);
    int getScore();
    void resetScore();
}

 class FootballScoring implements ScoringInterface {
    private int score;

    @Override
    public void addScore(int points) {
        score += points;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void resetScore() {
        score = 0;
    }
}
public class ex5 {
    public static void main(String args[]){
        ScoringInterface obj = new FootballScoring();
       obj.addScore(35);
       int points = obj.getScore();
       System.out.println(points);
    }
}