class Solution {
    public void dfs(int i,int j,char[][] grid){
        grid[i][j]='0';
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        for(int[] row:dir){
            int a=i+row[0];
            int b=j+row[1];
            if(a<0||b<0||a>=grid.length||b>=grid[0].length||grid[a][b]!='1')continue;
            dfs(a,b,grid);
        }
    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
}