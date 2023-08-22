package aditi;
import java.util.*;
//Works on bases of dynamic programming
public class Bellman_Ford_Algorithm {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int src, int dest, int wt) {
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -10));
    }
    public static void bellmanFord(ArrayList<Edge> graph[], int src, int V){
        int dist[] = new int[V];
        for (int i=0; i<V; i++){
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int k=0; k<V-1; k++){  //O(V)
            //O(E)
            for (int i=0; i<V; i++){
                for (int j=0; j<graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.source;
                    int v = e.destination;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.weight < dist[v]){ //relaxation
                        dist[v] = dist[u] + e.weight;
                    }
                }
            }
        }
        //detect -ive weight cycles
        for (int i=0; i<V; i++){
            for (int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int u = e.source;
                int v = e.destination;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + e.weight < dist[v]){ //relaxation
                    System.out.println("Negative weight cycle.");
                }
            }
        }
        for (int i=0; i<dist.length; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        bellmanFord(graph, 0, V);
    }
}