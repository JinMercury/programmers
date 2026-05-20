package level_2;

import java.util.*;

public class n2_배열_자르기 {

    public static void main(String[] args) {
        int n = 4;
        long left = 7;
        long right = 14;
        
        System.out.println(Arrays.toString(solution(n, left, right)));
    }

    private static int[] solution(int n, long left, long right) {
        int[] result = new int[(int)(right - left + 1)];

        int cnt = 0;
        for (long i = left; i <= right; i++) {
            // 행과 열 값을 비교해서 더 큰값 + 1 저장
            if(i / n <= i % n) {
                result[cnt] = (int)(i % n) + 1;
            } else {
                result[cnt] = (int)(i / n) + 1;
            }
            cnt++;
        }

        return result;
    }
    
}
