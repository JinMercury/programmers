package level_2;

import java.util.*;

public class 더_맵게 {

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville) {
            pq.offer(s);
        }

        // 가장 작은 두 개의 음식을 섞어서 새로운 음식의 스코빌 지수를 계산
        while(pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            pq.offer(first + (second * 2));
            answer++;
        }

        // 모든 음식의 스코빌 지수가 K 이상이 되도록 섞는 것이 불가능한 경우 -1 반환
        if(pq.peek() < K) {
            return -1;
        }

        return answer;
    }
    
}
/* 제미나이 코드리뷰
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        // 초기 용량을 지정하여 불필요한 내부 배열 확장을 방지
        PriorityQueue<Integer> pq = new PriorityQueue<>(scoville.length);
        
        for (int s : scoville) {
            pq.offer(s);
        }

        // 가장 맵지 않은 음식이 K 미만인 동안 반복
        while (pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            
            // 섞은 음식의 스코빌 지수 계산
            int mixed = first + (second * 2);
            pq.offer(mixed);
            answer++;
        }

        // 모든 음식을 섞었거나 조건을 만족했을 때, 
        // 마지막 남은 음식이 K보다 작은지 확인
        if (pq.isEmpty() || pq.peek() < K) {
            return -1;
        }

        return answer;
    }
*/