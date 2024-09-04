import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    static int minDistance(int[] dist, Boolean[] checked) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < dist.length; v++)
            if (!checked[v] && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    static void printSolution(int src, int[] dist, Map<Integer, Integer> parents) {
        System.out.println(
                "Vertex \t\t Distance from Source");
        for (int i = 0; i < dist.length; i++) {
            System.out.print((i + 1) + ": " + dist[i] + ". ");
            System.out.print("Path: ");
            printPath(i, src, parents);
            System.out.println();
        }
    }

    static void printPath(int src, int des, Map<Integer, Integer> parents) {
        Stack<Integer> track = new Stack<>();
        while (src != des) {
            track.push(src);
            src = parents.getOrDefault(src, -1);
        }
        track.push(des);
        while (!track.isEmpty()) {
            System.out.print((track.pop() + 1) + (track.isEmpty() ? "." : " -> "));
        }
    }

    static void dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        Map<Integer, Integer> parents = new HashMap<>();

        Boolean[] checked = new Boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            checked[i] = false;
        }

        dist[src] = 0;
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, checked);

            checked[u] = true;
            for (int v = 0; v < V; v++) {
                if (!checked[v] && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    parents.put(v, u);
                }
            }
        }

        printSolution(src, dist, parents);
    }

    public static void main(String[] args) {
        int[][] graph
                = new int[][]{
                {0, 3, 4, 0, 0, 0, 0, 0},
                {3, 0, 5, 10, 0, 9, 0, 0},
                {4, 5, 0, 8, 5, 0, 0, 0},
                {0, 10, 8, 0, 6, 10, 7, 3},
                {0, 0, 5, 9, 0, 0, 4, 0},
                {0, 9, 0, 10, 0, 0, 0, 2},
                {0, 0, 0, 7, 4, 0, 0, 5},
                {0, 0, 0, 3, 0, 2, 5, 0}};

        dijkstra(graph, 0);
    }
}