public class mColouringProb {
  
  boolean graphColoring(int[][] edges, int m, int n) {
        int[] colour = new int[n];
        return solve(0, colour, m, n, edges);
    }

    public boolean solve(int vertex, int[] colour, int m, int n, int[][] edges){
        if(vertex==n) return true;
        for(int c = 1;c<=m;c++){
            if(isSafe(vertex, c, colour, n, edges)){
                colour[vertex] = c;
                if(solve(vertex+1,colour,m,n,edges)) return true;
                colour[vertex] = 0;
            }
        }
        return false;
    }

    public boolean isSafe(int vertex,int c,int[] colour,int n,int[][] edges){
        for(int i = 0;i<n;i++){
            // adjacent and same colour
            if(edges[vertex][i] ==1 && colour[i] == c) return false;
        }
        return true;
    }
}
