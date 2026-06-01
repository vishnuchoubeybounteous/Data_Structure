class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int i=cost.length-3;
        int sum=0;
        while(i>=0){
          sum+=cost[i+2];
          sum+=cost[i+1];
          i-=3;
        }
        if(i==-1){
            sum+=cost[0];
            sum+=cost[1];
        }
        else if(i==-2){
            sum+=cost[0];
        }
        return sum;
    }
}