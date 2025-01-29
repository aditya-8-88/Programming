package leetcode.graph;

import java.util.*;

public class main {
    private static void dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == 2){
            return;
        }
        grid[i][j] = 2;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }

    public static int numIslands(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    cnt++;
                    dfs(grid, i, j);
                }
            }
        }

        return cnt;
    }

    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    dfs(grid, i, j);
                }
            }
        }

        return cnt;
    }

    private static void dfs(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || grid[i][j]=='2'){
            return;
        }
        // System.out.println(i+" "+j);
        grid[i][j] = '2';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }

    public int[][] findFarmland(int[][] land) {
        int m = land.length;
        int n = land[0].length;
        ArrayList<int[]> ls = new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(land[i][j]==1){
                    int[] t = getRowCol(land, i, j);
                    ls.add(new int[]{i,j,t[0],t[1]});
                }
            }
        }

        int[][] array = ls.toArray(new int[ls.size()][]);

        return array;
    }

    private static int[] getRowCol(int[][] land, int r1, int c1){
        int r=0, c=0;
        while(r<land.length-1){
            if(land[r][c]==land[r+1][c]) r++;
        }
        while(c<land[0].length-1){
            if(land[r][c]==land[r][c+1]) c++;
        }

        int r2 = r1+r, c2=c1+c;
        fill(land, r1, c1, r2, c2);

        return new int[]{r2,c2};
    }

    private static void fill(int[][] land, int r1, int c1, int r2, int c2){
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                land[i][j] = 2;
            }
        }
    }

    // public static void main(String[] args) {
        
    // }
}




// import java.util.*;

// public class Graph {
//     private int vertices; // Number of vertices
//     private int[][] adjMatrix; // Adjacency matrix

//     public Graph(int vertices) {
//         this.vertices = vertices;
//         this.adjMatrix = new int[vertices][vertices];
//     }

//     // Add an edge to the graph
//     public void addEdge(int src, int dest) {
//         adjMatrix[src][dest] = 1;
//         adjMatrix[dest][src] = 1; // For undirected graph
//     }

//     // DFS traversal
//     public void dfs(int start) {
//         boolean[] visited = new boolean[vertices];
//         System.out.print("DFS Traversal: ");
//         dfsUtil(start, visited);
//         System.out.println();
//     }

//     private void dfsUtil(int node, boolean[] visited) {
//         visited[node] = true;
//         System.out.print(node + " "); // Process node

//         for (int i = 0; i < vertices; i++) {
//             if (adjMatrix[node][i] == 1 && !visited[i]) {
//                 dfsUtil(i, visited);
//             }
//         }
//     }

//     // Display the adjacency matrix
//     public void displayMatrix() {
//         System.out.println("Adjacency Matrix:");
//         for (int i = 0; i < vertices; i++) {
//             for (int j = 0; j < vertices; j++) {
//                 System.out.print(adjMatrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int vertices = 5;
//         Graph graph = new Graph(vertices);

//         // Create edges (undirected)
//         graph.addEdge(0, 1);
//         graph.addEdge(0, 2);
//         graph.addEdge(1, 3);
//         graph.addEdge(1, 4);

//         // Display adjacency matrix
//         graph.displayMatrix();

//         // Perform DFS starting from vertex 0
//         graph.dfs(0);
//     }
// }
