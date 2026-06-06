class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int maxArea = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1 && visited[i][j] == false){
                    int area = dfs(i,j,visited,grid);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    public int dfs(int row, int col, boolean[][] visited, int[][] grid){
        int m = grid.length; int n = grid[0].length;
        visited[row][col] = true;
        int area = 1;
        for(int dr = -1;dr<=1;dr++){
            for(int dc = -1;dc<=1;dc++){
                if(Math.abs(dr)+Math.abs(dc) != 1) continue;
                int newRow = row+dr;
                int newCol = col+dc;
                if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && visited[newRow][newCol] == false && grid[newRow][newCol] == 1) area += dfs(newRow, newCol, visited, grid);
            }
        }
        return area;
    }
}