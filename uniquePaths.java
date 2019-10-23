class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] perm = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || j == 0)
                    perm[i][j] = 1;
                else
                    perm[i][j] = perm[i-1][j] + perm[i][j-1];
            }
        }
        
        return perm[m-1][n-1];
        
    }
}