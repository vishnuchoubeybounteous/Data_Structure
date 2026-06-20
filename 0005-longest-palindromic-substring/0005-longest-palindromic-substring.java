class Solution {
    public String longestPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            String t1=expand(i,i,s);
            if(t1.length()>str.length())str=t1;
            if(i>0&&s.charAt(i)==s.charAt(i-1)){
               String t2=expand(i,i-1,s);
               if(t2.length()>str.length()){
                 str=t2;
               }
            }
        }
        return str;
    }
    public String expand(int i,int j,String s){
        int a=i-1;
        int b=j+1;
        while(a>=0&&b<s.length()){
            if(s.charAt(a)!=s.charAt(b))break;
            a--;
            b++;
        }
        return s.substring(a+1,b);
    }
}