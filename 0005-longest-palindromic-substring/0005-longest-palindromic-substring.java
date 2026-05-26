class Solution {
    public String longestPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            String s1=expand(i,i,s);
            if(s1.length()>str.length())str=s1;
            String s2=expand(i,i+1,s);
            if(s2.length()>str.length())str=s2;
        }
        return str;
    }
    public String expand(int left,int right,String s){
        while(left>=0&&right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            else break;
        }
        return s.substring(left+1,right);
    }
}