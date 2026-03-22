class Solution {
    public void dfs(int i,int j,int[][] image,int oldColor,int newColor){
        if(i<0||j<0||i>=image.length||j>=image[0].length||image[i][j]!=oldColor)return;
        image[i][j]=newColor;
        int[][] dir={{-1,0},{1,0},{0,1},{0,-1}};
        for(int[] row:dir){
            int a=row[0]+i;
            int b=row[1]+j;
            dfs(a,b,image,oldColor,newColor);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;
        dfs(sr,sc,image,image[sr][sc],color);
        return image;
    }
}