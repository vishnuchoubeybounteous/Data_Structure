class Solution {
    public int minTotal(int i,int j,List<List<Integer>> triangle,Integer[][] dp){
        if(i==triangle.size()-1)return triangle.get(i).get(j);
        if(dp[i][j]!=null)return dp[i][j];
        int l=triangle.get(i).get(j)+minTotal(i+1,j,triangle,dp);
        int r=triangle.get(i).get(j)+minTotal(i+1,j+1,triangle,dp);
        return dp[i][j]=Math.min(l,r);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        Integer[][] dp=new Integer[m][m];
      
        return minTotal(0,0,triangle,dp);
    }
}