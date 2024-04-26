import java.util.*;

public class 08_ Bipart{

static class Edge {
    int src;
    int dest;

    public Edge(int s, int d) {
        this.src = s;
        this.dest = d;

    }

    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) { // BFS
        int col[] = new int[graph.length];

        for (int i = 0; i < col.length; i++) {
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) { // all componenet part of graph
            if (col[i] == -1) {
                col[i] = 0; // yellow
                q.add(i);

                while (!q.isEmpty()) { // BST
                    int curr = q.remove();

                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);

                        if (col[e.dest] == -1) { // case :1
                            int newCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = newCol;

                            q.add(e.dest);
                        }

                        else if (col[curr] == col[e.dest]) {
                            return false; // not bipartite
                        }

                    }
                }
            }
        }

        return true;

    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // o-vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        // 1-vertex
        graph[1].add(new Edge(1, 0));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));

        graph[2].add(new Edge(2, 4));

        // 3-vertex
        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        // 4-vertex
        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));

    }

    public static void main(String arg[]) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        create(graph);

        System.out.println(isBipartite(graph));
    }
}
