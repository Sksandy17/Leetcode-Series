class Solution {
    public int islandPerimeter(int[][] grid) {
        int pm = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==1){
                    pm += 4;
                    if(i>0 && grid[i-1][j]==1)
                        pm -= 2;
                    if(j>0 && grid[i][j-1]==1)
                        pm -= 2;
                }
            }
        }
        return pm;
    }
}
