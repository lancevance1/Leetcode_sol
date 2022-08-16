package Graph;

public class BricksFallingWhenHit {
    int[] r=new int[]{-1,1,0,0};
    int[] c=new int[]{0,0,-1,1};
    int[] res;
    boolean[][] visited;
    public int[] hitBricks(int[][] grid, int[][] hits) {
        res=new int[hits.length];
        for(int k=0;k<hits.length;k++){
            this.visited=new boolean[grid.length][grid[0].length];
            grid[hits[k][0]][hits[k][1]]=0;

            for(int i=0;i<grid[0].length;i++){
                if(grid[0][i]==0)continue;
                dfs(grid,0,i);
            }

            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(visited[i][j])continue;
                    if(grid[i][j]==1){
                        res[k]+=grid[i][j];
                        grid[i][j]=0;
                    }

                }
            }
        }
        return res;
    }

    private void dfs(int[][]grid,int row,int col){
        if(row<0||col<0||row==grid.length||col==grid[0].length)return;
        if(visited[row][col]){
            return;
        }
        visited[row][col]=true;

        if(grid[row][col]==1){

        }else{
            return;
        }

        for(int i=0;i<4;i++){
            int nRow = row+r[i];
            int nCol = col+c[i];
            dfs(grid,nRow,nCol);
        }
    }


}

 class UnionFind{
    int[]arr;
     UnionFind(){

     }

    void union(){

    }

    boolean find(){


        return false;
    }
}
