package level_2;

import java.util.*;

public class 뒤에_있는_큰_수_찾기 {

    public static void main(String[] args) {
        int[] numbers = {9, 1, 5, 3, 6, 2};

        System.out.println(Arrays.toString(solution(numbers)));
    }

    public static int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            answer[i] = -1;
            // 현재 숫자보다 작은 숫자의 인덱스가 스택에 있다면, 그 인덱스에 해당하는 답을 현재 숫자로 업데이트
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            // 스택에 인덱스 추가
            stack.push(i);
            // System.out.println("stack = " + stack);
        }
        
        return answer;
    }
    
}
/* 제미나이 코드리뷰
public static int[] solution(int[] numbers) {
    int n = numbers.length;
    int[] answer = new int[n];
    // 1. 모든 요소를 -1로 미리 초기화
    Arrays.fill(answer, -1);
    
    // 2. 성능을 위해 ArrayDeque 사용
    Deque<Integer> stack = new ArrayDeque<>();
    
    for (int i = 0; i < n; i++) {
        // 현재 숫자가 스택 최상단 인덱스의 숫자보다 크면
        // 그 인덱스의 '뒤에 있는 큰 수'는 현재 숫자가 됨
        while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
            answer[stack.pop()] = numbers[i];
        }
        // 현재 인덱스를 스택에 추가
        stack.push(i);
    }
    
    return answer;
}
*/