package level_2;

import java.util.*;

public class 롤케이크_자르기 {

    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        
        System.out.println(solution(topping));
    }

    public static int solution(int[] topping) {
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        // map에 토핑 전부 넣기
        for(int i : topping) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // System.out.println(map);

        // map에 있는 토핑을 하나씩 set으로 넣으면서 토핑 갯수가 같으면 result++
        for(int i : topping) {
            set.add(i);
            map.put(i, map.get(i) - 1);
            if(map.get(i) == 0) map.remove(i);

            if(set.size() == map.size()) result++;
        }

        return result;
    }
    
}
/* 제미나이 코드리뷰
public class 롤케이크_자르기 {
    public static int solution(int[] topping) {
        int answer = 0;
        int size = topping.length;

        // 토핑의 종류는 최대 10,000까지이므로 배열로 관리 (속도 향상)
        int[] rightCount = new int[10001]; // 동생이 가진 각 토핑의 개수
        int[] leftCount = new int[10001];  // 형이 가진 각 토핑의 개수

        int rightTypes = 0; // 동생의 토핑 종류 수
        int leftTypes = 0;  // 형의 토핑 종류 수

        // 초기 상태: 동생이 모든 토핑을 다 가짐
        for (int t : topping) {
            if (rightCount[t] == 0) rightTypes++;
            rightCount[t]++;
        }

        // 형이 토핑을 하나씩 가져오면서 비교
        for (int t : topping) {
            // 형에게 토핑 추가
            if (leftCount[t] == 0) leftTypes++;
            leftCount[t]++;

            // 동생에게서 토핑 제거
            rightCount[t]--;
            if (rightCount[t] == 0) rightTypes--;

            // 종류의 수가 같으면 카운트
            if (leftTypes == rightTypes) {
                answer++;
            }
            
            // 만약 형의 종류가 더 많아지기 시작하면 이후는 볼 필요 없음 (선택적 최적화)
            if (leftTypes > rightTypes) break;
        }

        return answer;
    }
}
*/