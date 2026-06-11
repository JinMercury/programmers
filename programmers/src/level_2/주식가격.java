package level_2;

import java.util.*;

public class 주식가격 {

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        System.out.println(Arrays.toString(solution(prices)));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        // 가격이 떨어지지 않은 기간 계산
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return answer;
    }
    
}

/* 제미나이 코드리뷰 - 스택을 이용한 풀이
public class 주식가격 {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // 현재 가격이 이전 가격(스택의 top)보다 떨어졌다면
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                answer[index] = i - index; // 기간 계산
            }
            stack.push(i);
        }

        // 끝까지 가격이 떨어지지 않은 인덱스들 처리
        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = n - 1 - index;
        }

        return answer;
    }
}
*/
