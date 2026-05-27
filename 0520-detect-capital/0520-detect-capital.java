class Solution {
    public boolean detectCapitalUse(String word) {
      if(word.length()==1)return true;
      char ch=word.charAt(0);
      if(Character.isLowerCase(ch)){
         for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i)))return false;
         }
      }
      else{
          char c1=word.charAt(1);
          boolean upper=Character.isUpperCase(c1);
            for(int i=1;i<word.length();i++){
                if(upper&&Character.isLowerCase(word.charAt(i)))return false;
                else if(!upper&&Character.isUpperCase(word.charAt(i)))return false;
            }
      }
      return true;
    }
}