public class Scoreboard {
  private String t1;
  private String t2;
  private int s1;
  private int s2;
  private boolean score;

  public Scoreboard(String team1, String team2) {
    team1 = t1;
    team2 = t2;
    s1 = 0;
    s2 = 0;
    score = true;
  }

  public void recordPlay(int count){
      while (score == true) {
        s1 += count; }
      if (count == 0) {
        score = !score; }
      while (score == false) {
        s2 += count;
      }
    }

  public String getScore() {
    String teamScore = t1;
    if (score == false) {
      teamScore = t2;
    }
    return s1 + "-" + s2 + "-" + teamScore;
  }
}
