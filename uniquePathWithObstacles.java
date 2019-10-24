class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if(obstacleGrid == null)
            return 0;
        
        int R = obstacleGrid.length;
        int C = obstacleGrid[0].length;
        int[][] perm = new int[R][C];
        
        if(obstacleGrid[0][0] == 1)
            return 0;
        if(obstacleGrid[R-1][C-1] == 1)
            return 0;
        if(R == 1 && C == 1)
            return 1;
        
        for(int i=1; i<R; i++){
            if(obstacleGrid[i][0] == 1 || obstacleGrid[i-1][0] == 1)
                perm[i][0] = 0;
            else
                perm[i][0] = 1;
        }
        
        for(int i=1; i<C; i++){
            if(obstacleGrid[0][i] == 1 || obstacleGrid[0][i-1] == 1)
                perm[0][i] = 0;
            else
                perm[0][i] = 1;
        }
        
        
        for(int i=1; i<R; i++){
            for(int j=1; j<C; j++){
                if(obstacleGrid[i-1][j] == 1 && obstacleGrid[i][j-1] == 1)
                    perm[i][j] = 0;
                else if(obstacleGrid[i-1][j] == 1)
                    perm[i][j] = perm[i][j-1];
                else if(obstacleGrid[i][j-1] == 1)
                    perm[i][j] = perm[i-1][j];
                else
                    perm[i][j] = perm[i-1][j] + perm[i][j-1]; 
            }
        }
        
        return perm[R-1][C-1];
        
    }
}