package training;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BfsGraph {
    public static void bfsGraph(int start, int mat[][], int v) {
        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[v];
        visited[start] = true;
        que.offer(start);
        while (!que.isEmpty()) {
            int curr = que.poll();
            System.out.print(curr + " ");
            for (int i = 0; i < v; i++) {
                if (mat[curr][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    que.offer(i);
                }
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
        BfsGraph.bfsGraph(starting, graph, v);
        sc.close();
    }
}
