class Solution {
    public int characterReplacement(String s, int k) {
       int[] hash=new int[26];
       int max=0;
       int count=0;
       int left=0;
       for(int i=0;i<s.length();i++){
           max=Math.max(max,++hash[s.charAt(i)-'A']);
           while((i-left+1)-max>k){
              hash[s.charAt(left)-'A']--;
              left++;
           }
           count=Math.max(i-left+1,count);
           

       } 
       return count;
    }
}