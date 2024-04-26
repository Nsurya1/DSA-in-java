// undirected graph

import java.util.*;

public class cycleDetection_UD {
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

        // o-vertex
        graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        // 1-vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // 3-vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        // 4-vertex
        graph[4].add(new Edge(4, 3));

    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean visit[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                if (detectCycleUtil(graph, i, -1, visit)) {
                    return true;
                }
                // cycle exit in any part of component of the graph
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, int par, boolean vis[]) {

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // case:3
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, e.dest, curr, vis)) {
                    return true;
                }
            }
            // case:2
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }
            // case:3
            // do nothing continue
        }
        return false;
    }

    public static void main(String arg[]) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        create(graph);
        System.out.print(detectCycle(graph));
    }
}
