package level_2;

import java.util.*;

public class 기능개발 {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();

        // 걸리는 일 수 저장
        for (int i = 0; i < progresses.length; i++) {
            if((100 - progresses[i]) % speeds[i] == 0) {
                list.add((100 - progresses[i]) / speeds[i]);
            } else {
                list.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }
        // System.out.println(list);

        // 가장 앞의 기능이 개발될 때 뒤에 있는 기능이 개발됐다면 같이 저장
        List<Integer> arr = new ArrayList<>();
        while (!list.isEmpty()) {
            int cnt = 0;
            int listInt = list.get(0);
            for (int j = 0; j < list.size(); j++) {
                if (listInt < list.get(j)) break;
                if (listInt >= list.get(j)) {
                    list.remove(j);
                    j--;
                    cnt++;
                } 
            }
            arr.add(cnt);
        }
        
        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
    
}
/*  제미나이 코드리뷰

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();

        // 1. 각 기능의 완료까지 걸리는 일수 계산 후 Queue에 삽입
        for (int i = 0; i < progresses.length; i++) {
            // 정수 연산으로 올림 처리: (잔여량 + 속도 - 1) / 속도
            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            days.add(day);
        }

        List<Integer> answerList = new ArrayList<>();

        // 2. 함께 배포될 기능 개수 계산
        while (!days.isEmpty()) {
            int currentMaxDay = days.poll(); // 기준이 되는 첫 번째 기능의 배포일
            int count = 1;

            // 다음 기능들이 기준일보다 빨리 끝난다면 함께 배포
            while (!days.isEmpty() && days.peek() <= currentMaxDay) {
                days.poll();
                count++;
            }

            answerList.add(count);
        }

        // 3. List를 int[]로 변환
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
*/