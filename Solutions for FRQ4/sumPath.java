public int sumPath(int row, int col)
{
    int total = grid[row][col];
    Location j = getNextLoc(row, col);

    while(j != null)
    {
        total += grid[j.getRow()][j.getCol()]; 

        if(j.getRow() < grid.length - 1 || j.getCol() < grid[0].length - 1){
          j = getNextLoc(loc.getRow(), loc.getCol()); }
            
        else {
            loc = null;
        }   
    }

    return sum;
}
