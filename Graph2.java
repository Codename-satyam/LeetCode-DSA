import java.util.ArrayList;
import java.util.List;
class Graph2{
    List<List<Integer>> adjList = new ArrayList<>();
    public void dfs(int [][]graph,boolean[] visited,int src,int dest,ArrayList<Integer>path){
        path.add(src);
        if(src == dest){
            adjList.add(new ArrayList<>());
            path.remove(path.size() - 1);
            return;
        }
        visited[src] = true;
        for(int i=0;i<graph[src].length;i++){
            if(visited[i]==false){
                dfs(graph, visited, i, dest, path);
            }
        }
        visited[src] = false;
        path.remove(path.size() - 1);
    }
}