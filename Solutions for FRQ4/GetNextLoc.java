public Location getNextLoc(int row, int col) {

    Location below = new Location(row + 1, col);
    Location next = new Location(row, col + 1);

    if(row == grid.length - 1) {
        return below;
    }
    if(col == grid[0].length - 1) {
        return next;
    }

    if(grid[row + 1][col] < grid[row][col + 1]) {
        return below;
        }
    else {
        return next;
    }
}
