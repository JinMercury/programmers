package level_2;

import java.util.*;

public class 방문_길이 {

    public static void main(String[] args) {
        String dirs = "LULLLLLLU";

        System.out.println(solution(dirs));
    }

    public static int solution(String dirs) {
        Set<String> set = new HashSet<>();
        int x = 0, y = 0;

        for(int i = 0; i < dirs.length(); i++) {
            int px = x, py = y;
            char c = dirs.charAt(i);

            if((c == 'U' && y == 5) || (c == 'D' && y == -5) 
                || (c == 'L' && x == -5) || (c == 'R' && x == 5)) {
                continue;
            }

            switch(c) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }

            // 다른 방향에서 같은 길을 지나갈 때도 방문한 길로 간주해야 하므로, 반대 방향의 길도 같이 저장
            String path1 = x + " " + y + " " + px + " " + py;
            String path2 = px + " " + py + " " + x + " " + y;
            set.add(path1);
            set.add(path2);
        }
        // System.out.println(set);

        // 방문한 길의 개수는 set의 크기의 절반
        return set.size() / 2;
    }
    
}

/* 제미나이 코드리뷰
public class 방문_길이 {

    public static void main(String[] args) {
        String dirs = "LULLLLLLU";
        System.out.println(solution(dirs));
    }

    public static int solution(String dirs) {
        // 경로를 저장할 Set (중복 제거)
        Set<String> visitedPaths = new HashSet<>();
        
        int x = 0, y = 0;

        for (char c : dirs.toCharArray()) {
            int nx = x, ny = y;

            // 1. 다음 좌표 계산
            if (c == 'U') ny++;
            else if (c == 'D') ny--;
            else if (c == 'R') nx++;
            else if (c == 'L') nx--;

            // 2. 경계값 체크 (좌표 평면을 벗어나면 무시)
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }

            // 3. 경로 정규화: (현재->다음)과 (다음->현재)를 동일하게 취급하기 위해
            // 좌표를 정렬하여 하나의 문자열로 만듦
            String path;
            if (x < nx || (x == nx && y < ny)) {
                path = x + "" + y + "" + nx + "" + ny;
            } else {
                path = nx + "" + ny + "" + x + "" + y;
            }

            visitedPaths.add(path);

            // 4. 좌표 업데이트
            x = nx;
            y = ny;
        }

        return visitedPaths.size();
    }
}
*/