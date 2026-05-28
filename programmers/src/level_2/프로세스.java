package level_2;

import java.util.*;

public class 프로세스 {

    public static void main(String[] args) {
        int[] priorities = {2, 3, 1, 2};
        int location = 3;
        
        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        int result = 0;

        // 프로세스와 우선순위 생성
        Queue<Integer> priQueue = new LinkedList<>();
        List<Integer> pri = new ArrayList<>();
        for(int i = 0; i < priorities.length; i++) {
            priQueue.add(i);
            pri.add(priorities[i]);
        }
        // System.out.println(priQueue);
        // System.out.println(pri);

        int cnt = 0;
        // 큐가 빌때까지 반복
        while (!priQueue.isEmpty()) {
            int poll = priQueue.poll();
            boolean flag = false;

            // 현재 큐보다 우선순위가 높은 큐가 있다면 뒤로 보냄
            // 현재 큐가 우선순위가 제일 높다면 result값에 저장 후 break;
            for(int j = 0; j < pri.size(); j++) {
                if(pri.get(0) < pri.get(j)) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                pri.add(pri.get(0));
                pri.remove(0);
                priQueue.add(poll);
            } else {
                cnt++;
                pri.remove(0);
                if(poll == location) {
                    result = cnt;
                    break;
                }
            }
            // System.out.println(priQueue);
            // System.out.println(pri);
        }

        return result;
    }
    
}

/* 제미나이 코드 리뷰 제안
    public int solution(int[] priorities, int location) {
        // 1. 우선순위를 내림차순으로 정렬하여 관리하는 우선순위 큐 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int p : priorities) {
            pq.add(p);
        }

        int answer = 0;

        // 2. 큐가 빌 때까지 반복
        while (!pq.isEmpty()) {
            // 3. 기존 priorities 배열을 순회하며 실행 조건 확인
            for (int i = 0; i < priorities.length; i++) {
                // 4. 현재 인덱스의 우선순위가 큐의 가장 높은 우선순위와 같다면 실행
                if (priorities[i] == pq.peek()) {
                    pq.poll(); // 실행했으므로 큐에서 제거
                    answer++;  // 실행 횟수 증가

                    // 5. 현재 실행한 프로세스가 내가 찾던 위치(location)라면 정답 반환
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
*/