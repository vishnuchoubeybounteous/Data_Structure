class NumArray {
   int[] nums;
   int[] prefix;
    public NumArray(int[] nums) {
        this.nums=nums;
        this.prefix=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefix[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
         int val=prefix[right]-prefix[left]+nums[left];
        return val;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */