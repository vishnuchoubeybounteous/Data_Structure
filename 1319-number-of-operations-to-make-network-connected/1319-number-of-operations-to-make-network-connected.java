class Solution {
    public int findpar(int u,int[] par){
        if(u==par[u])return u;
        return par[u]=findpar(par[u],par);
    }
    public boolean unionFind(int u,int v,int[] par,int[] size){
        int upar=findpar(u,par);
        int vpar=findpar(v,par);
        if(upar==vpar)return false;
        if(size[upar]>=size[vpar]){
            size[upar]+=size[vpar];
            par[vpar]=upar;
        }
        else{
            size[vpar]+=size[upar];
            par[upar]=vpar;
        }
        return true;
    }
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1)return -1;
        int[] par=new int[n+1];
        int[] size=new int[n+1];
         for(int i=0;i<n;i++){
            par[i]=i;
         }
        Arrays.fill(size,1);
        int count=0;
        for(int[] arr:connections){
            if(unionFind(arr[0],arr[1],par,size)){
               count++;
            }
        }
        return n-count-1;


    }
}