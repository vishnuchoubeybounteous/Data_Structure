class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n-k+1;i++){
            String str=s.substring(i,i+k);
            set.add(str);
            if(set.size()==(int)Math.pow(2,k))return true;
        }
        return false;
    }
}