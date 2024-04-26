import java.util.*;

public class targetSourcePath {

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

        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));

        // 3-vertex
        graph[3].add(new Edge(3, 1));

        // 4-vertex
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void findPath(ArrayList<Edge>[] graph, int src, int dest, String str) {
        if (src == dest) {
            System.out.println(str + dest + " ");
            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            findPath(graph, e.dest, dest, str + src);
        }
    }

    public static void main(String arg[]) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        create(graph);

        int src = 5;
        int dest = 1;
        findPath(graph, src, dest, "");
    }

}
