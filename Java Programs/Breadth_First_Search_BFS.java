package aditi;
import java.util.*;
//Time Complexity = O(V+E)
public class Breadth_First_Search_BFS {
    static class Edge{
        int source;
        int destination;

        public Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }
    public static void BFS(ArrayList<Edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean visited_array[] = new boolean[V];
        q.add(0);

        while (!q.isEmpty()){
            int current = q.remove();
            if (visited_array[current] == false){
                System.out.print(current + " ");
                visited_array[current] = true;
                for (int i=0; i<graph[current].size(); i++){
                    Edge e = graph[current].get(i);q.add(e.destination);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        /*
            1 --- 3 \
           /      |  \
          0       |   5 -- 6
           \      |  /
            2 --- 4 /
         */
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        BFS(graph, V);
        System.out.println();
    }
}
