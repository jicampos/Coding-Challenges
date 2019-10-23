class Solution {
    public int minPathSum(int[][] grid) {
        
        if(grid == null)
            return 0;
        
        int[][] perm = new int[grid.length][grid[0].length];
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(i == 0 && j == 0)
                    perm[0][0] = grid[0][0];
                else if(i == 0)
                    perm[i][j] = grid[i][j] + perm[i][j-1];
                else if(j == 0)
                    perm[i][j] = grid[i][j] + perm[i-1][j];
                else { 
                    if(perm[i][j-1] > perm[i-1][j])
                        perm[i][j] = grid[i][j] + perm[i-1][j];
                    else
                        perm[i][j] = grid[i][j] + perm[i][j-1];
                }
            }
        }
        
        return perm[grid.length-1][grid[0].length-1];
        
    }
}