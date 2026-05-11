package all_level_1;

import java.util.Arrays;

public class 덧칠하기 {

    public static void main(String[] args) {
        int n = 10;
        int m = 4;
        int[] section = {1, 2, 3, 10};
        
        System.out.println(solution(n, m, section));
    }

    private static int solution(int n, int m, int[] section) {
        int result = 0;
        
        // 1-10 중 section값이 포함되면 i값에 m을 더하고 result++
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= section.length; j++) {
                if(i == section[j-1]) {
                    result++;
                    i += m;
                }
            }
        }
        return result;
    }
    
}
