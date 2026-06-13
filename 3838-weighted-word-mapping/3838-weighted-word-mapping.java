class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String str="";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int sum=0;
            for(int j=0;j<s.length();j++){
                sum+=weights[s.charAt(j)-'a'];
            }
            sum=sum%26;
            str+=(char)('z'-sum);
        }
        return str;
    }
}