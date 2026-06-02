package level_2;

import java.util.*;

public class 타겟_넘버 {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        System.out.println(solution(numbers, target));
    }

    public static int solution(int[] numbers, int target) {
        int result = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0}); // {index, current_sum}

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int index = current[0];
            int currentSum = current[1];

            if(index == numbers.length) {
                if(currentSum == target) {
                    result++;
                }
                continue;
            }

            queue.offer(new int[]{index + 1, currentSum + numbers[index]});
            queue.offer(new int[]{index + 1, currentSum - numbers[index]});
        }

        return result;
    }
    
}
