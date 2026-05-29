class Solution {
    public int getLucky(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++){
            str+=s.charAt(i)-'a'+1;
        }
       
        int ans=0;
        for(int j=0;j<k;j++){
         int temp=0;
        for(int i=0;i<str.length();i++){
             int a=str.charAt(i)-'0';
             temp+=a;
        }
        ans=temp;
        str=Integer.toString(temp);
        }
        return ans;

    }
}