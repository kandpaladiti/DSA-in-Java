package aditi;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras_Algorothm {
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

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 4, 5));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    public static class Pair implements Comparable<Pair> {
        int node;
        int distance;
        public Pair(int n, int d){
            this.node = n;
            this.distance = d;
        }
        @Override
        public int compareTo(Pair p2){
          return this.distance - p2.distance; //ascending
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[], int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for (int i=0; i<V; i++){
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];

        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()){
            Pair current = pq.remove(); //shortest distance
            if (!vis[current.node]){
                vis[current.node] = true;

                for (int i=0; i<graph[current.node].size(); i++){
                    Edge e = graph[current.node].get(i);
                    int u = e.source;
                    int v = e.destination;
                    if (dist[u] + e.weight < dist[v]){ //relaxation
                        dist[v] = dist[u] + e.weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i=0; i<V; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        dijkstra(graph, 0, V);
    }
}

//Time Complexity = O(E + E log V)