package aditi;
import java.util.ArrayList;

public class Cycle_Detection_Undirected_Graph {
    static class Edge {
        int source;
        int destination;

        public Edge(int src, int dest) {
            this.source = src;
            this.destination = dest;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean visited_array[], int current, int parent) {
        visited_array[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (visited_array[e.destination] && e.destination != parent) {
                return true;
            } else if (!visited_array[e.destination]) {
                if (isCycleUndirected(graph, visited_array, e.destination, current)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        System.out.println(isCycleUndirected(graph, new boolean[V], 0, -1));
    }
}

//Time Complexity - O(V+E)