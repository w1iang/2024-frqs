import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  // public Location getNextLoc(int row, int col) {
    
  // }

  
  // PART B
  // public int sumPath(int row, int col) {

  // }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
