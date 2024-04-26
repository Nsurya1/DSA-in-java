import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class bellmanFord {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }

    }

    // public static void create(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }

    // graph[0].add(new Edge(0, 1, 2));
    // graph[0].add(new Edge(0, 2, 4));

    // graph[1].add(new Edge(1, 2, -4));

    // graph[2].add(new Edge(2, 3, 2));

    // graph[3].add(new Edge(3, 4, 4));

    // graph[4].add(new Edge(4, 1, -1));

    // }

    // public static void bellmanSort1(ArrayList<Edge> graph[], int src) {
    // int dist[] = new int[graph.length]; // dist[i] -> src to i

    // for (int i = 0; i < graph.length; i++) {
    // if (i != src) {
    // dist[i] = Integer.MAX_VALUE; // +infinty
    // }
    // }

    // // O(V+E)
    // int V = graph.length;
    // for (int i = 0; i < V - 1; i++) {
    // // O(E)
    // for (int j = 0; j < graph.length; j++) {
    // for (int k = 0; k < graph[j].size(); k++) {
    // Edge e = graph[j].get(k);
    // int u = e.src;
    // int v = e.dest;
    // int wt = e.wt;
    // if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
    // dist[v] = dist[u] + wt;
    // }
    // }
    // }
    // }

    // // print all source to vertices shortest dist

    // for (int i = 0; i < dist.length; i++) {
    // System.out.print(dist[i] + " ");
    // }
    // System.out.println();

    // }

    public static void createGraph2(ArrayList<Edge> graph) {

        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        graph.add(new Edge(1, 2, -4));

        graph.add(new Edge(2, 3, 2));

        graph.add(new Edge(3, 4, 4));

        graph.add(new Edge(4, 1, -1));

    }

    public static void bellmanSort2(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V]; // dist[i] -> src to i

        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // +infinty
            }
        }

        // O(V+E)
        for (int i = 0; i < V - 1; i++) {
            // O(E)
            for (int j = 0; j < graph.size(); j++) {
                Edge e = graph.get(j);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }

        }

        // print all source to vertices shortest dist

        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();

    }

    public static void main(String arg[]) {
        int V = 5;
        // ArrayList<Edge>[] graph = new ArrayList[V];
        // create(graph);
        int src = 0;
        // bellmanSort1(graph, src);

        ArrayList<Edge> graph = new ArrayList<>();
        createGraph2(graph);
        bellmanSort2(graph, src, V);
    }
}
