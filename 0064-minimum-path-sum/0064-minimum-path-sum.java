class Solution {
    public int minPath(int i,int j,int[][] grid,int[][] dp){
        if(i>=grid.length||j>=grid[0].length)return 100000;
        if(i==grid.length-1&&j==grid[0].length-1)return grid[grid.length-1][grid[0].length-1];
        if(dp[i][j]!=-1)return dp[i][j];
        int l=grid[i][j]+minPath(i+1,j,grid,dp);
        int r=grid[i][j]+minPath(i,j+1,grid,dp);
        return dp[i][j]=Math.min(l,r);
    }
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return minPath(0,0,grid,dp);
    }
}