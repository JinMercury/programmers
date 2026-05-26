package level_2;

import java.util.*;

public class 피로도 {
    static int result = 0;

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        
        System.out.println(solution(k, dungeons));
    }

    public static int solution(int k, int[][] dungeons) {
        result = 0;
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, 0, dungeons, visited);

        return result;
    }

    private static void dfs(int k, int count, int[][] dungeons, boolean[] visited) {
        result = Math.max(result, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(k - dungeons[i][1], count + 1, dungeons, visited);
                visited[i] = false;
            }
        }
    }
}
