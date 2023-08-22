package aditi;
import java.util.*;

public class TopologicalSorting {
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
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void topologicalSortUtility(ArrayList<Edge> graph[], int current, boolean visited_array[], Stack<Integer> stack){
        visited_array[current] = true;
        for (int i=0; i<graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if (!visited_array[e.destination]){
                topologicalSortUtility(graph, e.destination, visited_array, stack);
            }
        }
        stack.push(current);
    }
    public static void topologicalSort(ArrayList<Edge> graph[], int V){
        boolean visited_array[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int  i=0; i<V; i++){
            if (!visited_array[i]){
                topologicalSortUtility(graph, i, visited_array,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        topologicalSort(graph, V);
    }
}
//Time Complexity - O(V+E)