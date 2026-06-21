class Solution {
    public boolean checkValidString(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                a++;
                b++;
            }
            else if(s.charAt(i)==')'){
                a--;
                b--;
            }
            else{
                a++;
                b--;
            }
            if(a<0)return false;
            if(b<0)b=0;
        }
        return b==0;
    }
}