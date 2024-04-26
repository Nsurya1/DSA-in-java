import java.util.*;

public class topology_sort_BFS {
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

    public static void calInDegree(ArrayList<Edge>[] graph, int inDeg[]) {

        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                inDeg[e.dest]++;
            }
        }
    }

    public static void topologicalSort(ArrayList<Edge>[] graph) {
        int inDegree[] = new int[graph.length];
        calInDegree(graph, inDegree);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        // BFS

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " "); // topological sort

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;
                if (inDegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }

    }

    public static void main(String arg[]) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        create(graph);
        topologicalSort(graph);
    }
}
