class Solution {
    public int robber(int ind,int[] nums,int[] dp){
        if(ind>nums.length-1)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int l=nums[ind]+robber(ind+2,nums,dp);
        int r=robber(ind+1,nums,dp);
        return dp[ind]=Math.max(l,r);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return robber(0,nums,dp);
    }
}