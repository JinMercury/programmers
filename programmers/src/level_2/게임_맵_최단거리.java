package level_2;

import java.util.*;

public class 게임_맵_최단거리 {

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        
        System.out.println(solution(maps));
    }

    public static int solution(int[][] maps) {
        int result = -1;
        int n = maps.length;
        int m = maps[0].length;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // {x, y, distance}
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            if(x == n - 1 && y == m - 1) {
                result = distance;
                break;
            }

            for(int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if(newX >= 0 && newX < n && newY >= 0 && newY < m 
                   && maps[newX][newY] == 1 && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.offer(new int[]{newX, newY, distance + 1});
                }
            }
        }

        return result;
    }
    
}
