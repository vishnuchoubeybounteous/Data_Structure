class Solution {
    public int trap(int[] height) {
      int left=0;
      int lmax=0;
      int right=height.length-1;
      int rmax=height.length-1;
      int water=0;
      while(left<right){
        if(height[left]<=height[right]){
            left++;
            if(height[left]>=height[lmax]){
                lmax=left;
            }
            else{
                water+=height[lmax]-height[left];
            }
        }
        else{
            right--;
            if(height[right]>=height[rmax]){
                rmax=right;
            }
            else{
                water+=height[rmax]-height[right];
            }
        }
      } 
      return water; 
    }
}