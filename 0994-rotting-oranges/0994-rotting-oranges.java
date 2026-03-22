class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[][] dir={{-1,0},{1,0},{0,1},{0,-1}};
        if(fresh==0)return 0;
        int min=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] arr=q.poll();
                int s=arr[0];
                int v=arr[1];
                for(int[] row:dir){
                    int a=s+row[0];
                    int b=v+row[1];
                    if(a<0||b<0||a>=m||b>=n||grid[a][b]!=1)continue;
                    grid[a][b]=2;
                    q.offer(new int[]{a,b});
                }

            }
            fresh-=q.size();
            System.out.println(q.size());
            min++;
            if(fresh==0)return min;
            
        }
        return fresh!=0?-1:min;
    }
}