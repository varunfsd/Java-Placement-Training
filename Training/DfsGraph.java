package training;

import java.util.Scanner;

public class DfsGraph {
    public static void dfsGraph(int start, int[][] graph, boolean[] visited, int v) {
        visited[start] = true;
        System.out.print(start + "->");
        for (int i = 0; i < v; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                DfsGraph.dfsGraph(i, graph, visited, v);

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v, e;
        System.out.print("Enter The Vertices Count:-");
        v = sc.nextInt();
        System.out.print("Enter The Edges Count:-");
        e = sc.nextInt();
        int[][] graph = new int[v][v];
        System.out.println("Enter The Edges");
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph[src][dest] = 1;
            graph[dest][src] = 1;
        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter The Starting Node:-");
        int starting = sc.nextInt();
        DfsGraph.dfsGraph(starting, graph, new boolean[v], v);
        sc.close();
    }
}
