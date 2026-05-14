package level_2;

import java.util.*;

public class 연속_부분_수열_합의_개수 {

    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        
        System.out.println(solution(elements));
    }

    private static int solution(int[] elements) {
        int result = 0;

        int len = elements.length;
        int[] arr = new int[len * 2 + 1];

        // 누적합 배열 생성
        for (int i = 0; i < len * 2; i++) {
            arr[i + 1] = arr[i] + elements[i % len];
        }
        // System.out.println(Arrays.toString(arr));
        
        // i 값에서 i - 1 까지 연속 부분합을 집합에 추가
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int sum = arr[j + i] - arr[j];
                set.add(sum);
            }
        }
        // System.out.println(set);
        result = set.size() + 1;

        return result;
    }
    
}
