package LeetCode.DFS.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIfPathExist {

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        int source = 0;
        int destination = 10;
        System.out.println(validPath(n, edges, source, destination));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        dfs(source, visited, adj);
        return visited[destination];
    }

    public static void dfs(int u, boolean[] visited, List<List<Integer>> adj) {
        visited[u] = true;
        for(Integer v: adj.get(u)) {
            if(!visited[v]) {
                dfs(v, visited, adj);
            }
        }
    }

}
