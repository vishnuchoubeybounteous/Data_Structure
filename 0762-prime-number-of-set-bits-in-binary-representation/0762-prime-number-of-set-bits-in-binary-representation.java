class Solution {
    public boolean isPrime(int n){
        if(n<2)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String s=Integer.toBinaryString(i);
           
            int a=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1')a++;
            }
            System.out.println(a);
            if(isPrime(a))count++;
        }
        return count;
    }
}