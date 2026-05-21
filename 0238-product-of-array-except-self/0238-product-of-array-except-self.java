class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int prod=nums[0];
       int[] ans=new int[n];
       for(int i=1;i<n;i++){
         ans[i]=prod;
         prod*=nums[i];
       }
       prod=nums[n-1];
       for(int i=n-2;i>=0;i--){
        if(i==0){
            ans[i]=prod;
        }
        else
        ans[i]*=prod;
        prod*=nums[i];
       }
      
       return ans;
    }
}