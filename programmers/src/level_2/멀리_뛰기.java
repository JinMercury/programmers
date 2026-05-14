package level_2;

import java.math.*;

public class 멀리_뛰기 {

    public static void main(String[] args) {
        int n = 4;
        
        System.out.println(solution(n));
    }

    private static long solution(int n) {
        if (n == 1) return 1;
        long[] arr = new long[n + 1];

        arr[1] = 1;
        arr[2] = 2;

        // 피보나치 수열
        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }
        long result = arr[n];

        return result;
    }
    
}
