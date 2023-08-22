package aditi;
import java.util.ArrayList;

public class Graphs_UD_UW {
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
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        //Print 2's neighbours
        for (int i=0; i< graph[1].size(); i++){
            Edge e = graph[1].get(i);
            System.out.print(e.destination);
            if (i != graph[1].size()-1) {
                System.out.print(", ");
            }
        }
    }
}