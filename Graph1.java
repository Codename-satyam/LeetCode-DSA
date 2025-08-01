
import java.util.ArrayList;

public class Graph1 {
    public boolean dfs(ArrayList<ArrayList<Integer>>Graph, boolean[] visited,int src, int dest){
        if(src==dest){
            return true;
        }
        visited[src] = true;
        for(int i=0;i<Graph.get(src).size();i++){
            int child = Graph.get(src).get(i);
            if(!visited[child]){
                boolean ans = dfs(Graph, visited, child, dest);
                if(ans){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination){
        ArrayList<ArrayList<Integer>> Graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            Graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            Graph.get(u).add(v);
            Graph.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        return dfs(Graph, visited, source, destination);
    }
    public static void main(String[] args) {
        Graph1 graph = new Graph1();
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        boolean result = graph.validPath(5, edges, 0, 4);
        System.out.println("Is there a valid path? " + result);
    }
}
