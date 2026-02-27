class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int sum2=0;
        
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            if(sum2==sum)return i;
            sum2+=nums[i];
           
           
        }
        return -1;
    }
}