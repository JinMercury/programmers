package all_level_1;

import java.util.*;

public class 노란불_신호등 {

    public static void main (String[] args){
        int[][] signals = {{2,1,2}, {5,1,1}};

        System.out.println(solution(signals));
    }

    private static int solution(int[][] signals) {
        int len = 1;

        // 모든 구간이 시작상태로 돌아오는 시간
        // 시작상태로 돌아오는 시간까지 노란불이 겹치지 않는다면 -1 반환
        for (int i = 0; i < signals.length; i++) {
            int g = signals[i][0];
            int y = signals[i][1];
            int r = signals[i][2];

            len *= g+y+r;
        }

        // 노란불이 들어오는 구간에 +1
        int[] arr = new int[len+1];

        for(int i = 0; i < signals.length; i++) {
            int g = signals[i][0];
            int y = signals[i][1];
            int r = signals[i][2];
 
            int offset = g+y+r;

            for(int j = 1; j < len; j += offset) {
                for(int x = 0; x < y; x++) {
                    arr[g+j+x]++;
                }
            }
        }

        // 배열의 길이와 값이 같은 구간을 반환
        for(int i = 0; i < len; i++) {
            if(arr[i] == signals.length) {
                return i;
            }
        }
        
        return -1;
    }
}