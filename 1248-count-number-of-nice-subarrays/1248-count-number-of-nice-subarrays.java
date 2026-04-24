class Solution {
    public int numsSubarrays(int[] nums,int target){
     int left=0;
     int count=0;
     int odd=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]%2==1){
            odd++;
        }
        while(odd>target){
            if(nums[left]%2==1){
                odd--;
            }
            left++;
        }
        count+=i-left+1;
     }   
     return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
      return numsSubarrays(nums,k)-numsSubarrays(nums,k-1);
    }
}