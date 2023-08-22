package aditi;
import java.util.*;

public class Prims_Algorithm {
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
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }
    public static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost; //ascending
        }
    }
    public static void primsAlgo(ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[graph.length];
        pq.add(new Pair(0,0));
        int mstCost = 0;
        while (!pq.isEmpty()){
            Pair current = pq.remove();
            if (!visited[current.node]){
                visited[current.node] = true;
                mstCost += current.cost;

                for (int i=0; i<graph[current.node].size(); i++){
                    Edge e = graph[current.node].get(i);
                    if(!visited[e.destination]){
                        pq.add(new Pair(e.destination, e.weight));
                    }
                }
            }
        }
        System.out.println("min cost of mst = "+ mstCost);
    }
    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        primsAlgo(graph);
    }
}
