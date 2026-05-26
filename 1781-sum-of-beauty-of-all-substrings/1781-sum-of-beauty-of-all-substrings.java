class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
              int[] hash=new int[26];
            for(int j=i;j<s.length();j++){
              hash[s.charAt(j)-'a']++;
              int max=0;
              int min=Integer.MAX_VALUE;
              for(int temp:hash){
                if(temp==0)continue;
                min=Math.min(min,temp);
                max=Math.max(max,temp);
              }
              sum+=(max-min);
            }
        }
        return sum;
    }
}