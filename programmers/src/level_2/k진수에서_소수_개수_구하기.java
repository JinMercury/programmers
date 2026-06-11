package level_2;

import java.util.*;

public class k진수에서_소수_개수_구하기 {

    public static void main(String[] args) {
        int n = 437674;
        int k = 3;

        System.out.println(solution(n, k));
    }

    public static int solution(int n, int k) {
        // n을 k진수로 변환
        String kNum = Integer.toString(n, k);
        // System.out.println("k진수: " + kNum);

        // k진수 문자열을 0으로 분리하여 숫자 배열 생성
        String[] numbers = kNum.split("0");
        int count = 0;
        // System.out.println(Arrays.toString(numbers));

        // 각 숫자가 소수인지 확인
        for (String num : numbers) {
            if (!num.isEmpty()) {
                Long number = Long.parseLong(num);
                if (isPrime(number)) {
                    count++;
                }
            }
        }

        return count;
    }

    // 소수 여부를 확인하는 함수
    public static boolean isPrime(Long n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (Long i = 3L; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
