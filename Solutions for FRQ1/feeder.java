public class Feeder {
    private int currentFood;
  public void simulateOneDay(int numBirds)
  {
      if(Math.random() > 0.05)
      {
          int eatenFood = (int) (Math.random() * 41) + 10;
          currentFood -= numBirds * eatenFood;
          if(currentFood < 0)
              currentFood = 0;
      }
      else
      {
          currentFood = 0;
      }
  }
  public int simulateManyDays (int numBirds, int numDays) {
    int food = currentFood;
    simulateOneDay(numBirds);
    food -= currentFood * numDays;

    if (food < 0) {
      food = 0;
    }
    return food;
    }
  }
}
