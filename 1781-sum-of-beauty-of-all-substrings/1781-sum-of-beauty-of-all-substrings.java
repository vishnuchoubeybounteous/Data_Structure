class Solution {
    public int beautySum(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int[] hash=new int[26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                hash[ch-'a']++;
                int min=Integer.MAX_VALUE;
                int max=0;
                for(int k=0;k<26;k++){
                    if(hash[k]!=0){
                        min=Math.min(min,hash[k]);
                        max=Math.max(max,hash[k]);
                    }
                }
                count+=max-min;
            }
        }
        return count;
    }
}