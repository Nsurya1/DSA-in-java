import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // o-vertex
        graph[0].add(new Edge(0, 1, 5));
        // 1-vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3-vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        // 4-vertex
        graph[4].add(new Edge(4, 2, 2));

    }

    public static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> qu = new LinkedList<>();

        boolean visit[] = new boolean[graph.length];
        qu.add(0);
        while (!qu.isEmpty()) {
            int curr = qu.remove();
            if (!visit[curr]) {
                System.out.print(curr + " ");
                visit[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    qu.add(e.dest);
                }
            }
        }

    }

    public static void main(String arg[]) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        create(graph);
        bfs(graph);
    }
}
