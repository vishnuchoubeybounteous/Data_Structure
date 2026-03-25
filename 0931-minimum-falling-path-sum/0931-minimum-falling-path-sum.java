class Solution {
    public int fallingPath(int i,int j,int[][] matrix,Integer[][] dp){
        if(j>=matrix[0].length)return 100000;
        if(i==matrix.length)return 0;
        if(dp[i][j]!=null)return dp[i][j];
        int l=Integer.MAX_VALUE;
        if(j>0){
            l=matrix[i][j]+fallingPath(i+1,j-1,matrix,dp);
        }
        int r=matrix[i][j]+fallingPath(i+1,j,matrix,dp);
        int s=Integer.MAX_VALUE;
        if(j<matrix[0].length){
            s=matrix[i][j]+fallingPath(i+1,j+1,matrix,dp);
        }
        return dp[i][j]=Math.min(l,Math.min(r,s));
    }
    public int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        Integer[][] dp=new Integer[matrix.length][matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            min=Math.min(min,fallingPath(0,i,matrix,dp));
        }
        return min;
    }
}