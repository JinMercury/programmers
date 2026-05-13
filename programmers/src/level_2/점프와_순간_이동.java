package level_2;

import java.util.*;

public class 점프와_순간_이동 {

    public static void main(String[] args) {
        int n = 6;
        
        System.out.println(solution(n));
    }

    // k만큼 점프하면 k만큼 배터리가 소모
    // 이동한거리 x 2 순간이동 배터리 소모X
    private static int solution(int n) {
        int result = 1;

        while (n > 1) {
            if (n % 2 != 0) {
                n -= 1;
                result++;
            } else {
                n = n / 2;
            }
        }

        return result;
    }
}