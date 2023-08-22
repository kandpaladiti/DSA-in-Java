package aditi;
import java.util.*;

public class Cycle_Detection_Directed_Graph {
    static class Edge{
        int source;
        int destination;

        public Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean visited_array[], int current, boolean recursion[]){
        visited_array[current] = true;
        recursion[current] = true;
        for (int i=0; i<graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if (recursion[e.destination] = true){ //cycle
                return true;
            }
            else if(!visited_array[e.destination]){
                if(isCycleDirected(graph, visited_array, e.destination, recursion)) {
                    return true;
                }
            }
        }
        recursion[current] = false;
        return false;
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }
    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        boolean visited_array[] = new boolean[V];
        boolean recursion[] = new boolean[V];
        for (int i=0; i<V; i++){
            if (!visited_array[i]){
                boolean isCycle = isCycleDirected(graph, visited_array, 0, recursion);
                if (isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}