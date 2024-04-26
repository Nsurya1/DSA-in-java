
import java.util.*;

public class cycleDetection_DG {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    // public static void create(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }

    // // o-vertex
    // graph[0].add(new Edge(0, 2));

    // // 1-vertex
    // graph[1].add(new Edge(1, 0));

    // graph[2].add(new Edge(2, 3));

    // // 3-vertex
    // graph[3].add(new Edge(3, 0));

    // }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // o-vertex
        graph[0].add(new Edge(0, 1));

        // 1-vertex
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        // 3-vertex
        graph[2].add(new Edge(2, 3));

    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean visit[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                detectCycleUtil(graph, i, visit, stack);
                return true;
                // cycle exit in any part of component of the graph
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean[] stack) {

        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            if (stack[e.dest]) {
                return true;
            }

            if (!vis[e.dest] && detectCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }

        }

        stack[curr] = false;
        return false;
    }

    public static void main(String arg[]) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        create(graph);
        System.out.print(detectCycle(graph));
    }
}
