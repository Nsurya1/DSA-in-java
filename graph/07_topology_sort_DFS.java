import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topology_sort_DFS {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        // 3-vertex
        graph[3].add(new Edge(3, 1));

        // 4-vertex
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void 
    public static void main(String arg[]) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        create(graph);
        topologicalSort(graph);
    }
}
