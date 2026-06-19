class Solution {
    public int largestAltitude(int[] gain) {
       int g=0;
       int max=0;
       for(int i=0;i<gain.length;i++){
         g+=gain[i];
         max=Math.max(max,g);
       } 
       return max;
    }
}