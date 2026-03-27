class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        
        int m=mat.length;
        int n=mat[0].length;
        int[][] temp=new int[m][n];
        k=k%n;
        for(int i=0;i<m;i++){
            temp[i]=mat[i].clone();
            if(i%2==0){
              int[] arr=mat[i];
              reverse(0,n-1,arr);
              reverse(0,n-k-1,arr);
              reverse(n-k,n-1,arr);
            }
            else{
                int[] arr=mat[i];
                 reverse(0,n-1,arr);
              reverse(0,k-1,arr);
              reverse(k,n-1,arr);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=temp[i][j])return false;
            }
        }
        return true;
    
    }
    public void reverse(int i,int j,int[] arr){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}