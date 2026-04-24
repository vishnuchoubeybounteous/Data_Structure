class Solution {
    public int unique(int i,int j,int[][] dp){
        if(i<0||j<0)return 0;
        if(i==0&&j==0)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        int a=unique(i-1,j,dp);
        int b=unique(i,j-1,dp);
        return dp[i][j]=a+b;
    }
    public int uniquePaths(int m, int n) {
        
        int[][] dp=new int[m][n];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return unique(m-1,n-1,dp);
        // for(int i=0;i<m;i++){
        //     dp[i][0]=1;
        // }
        // for(int j=0;j<n;j++){
        //     dp[0][j]=1;
        // }
        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         dp[i][j]=dp[i-1][j]+dp[i][j-1];
        //     }
        // }
        // return dp[m-1][n-1];
    }
}