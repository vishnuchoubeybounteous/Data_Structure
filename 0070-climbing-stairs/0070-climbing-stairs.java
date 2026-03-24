class Solution {
    public int climbing(int ind,int n,int[]dp){
        if(ind>n)return 0;
        if(ind==n)return 1;
        if(dp[ind]!=-1)return dp[ind];
        int l=climbing(ind+1,n,dp);
        int r=climbing(ind+2,n,dp);
        return dp[ind]=l+r;
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return climbing(0,n,dp);
    }
}