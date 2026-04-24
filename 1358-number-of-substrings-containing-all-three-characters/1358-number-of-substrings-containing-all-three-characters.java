class Solution {
    public int numberOfSubstrings(String s) {
        int[] hash=new int[3];
        int left=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hash[ch-'a']++;
            while(hash[0]!=0&&hash[1]!=0&&hash[2]!=0){
                count+=s.length()-i;
                hash[s.charAt(left)-'a']--;
                 left++;
            }
        }
        return count;
    }
}