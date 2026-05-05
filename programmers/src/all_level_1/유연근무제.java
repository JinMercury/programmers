package all_level_1;

import java.util.*;

public class 유연근무제 {
    public static void main (String[] args){
        int[] schedules = {730, 855, 700, 720};
        int[][] timelogs = {{710, 700, 650, 735, 700, 931, 912}, {908, 901, 805, 815, 800, 831, 835}, 
        {705, 701, 702, 705, 710, 710, 711}, {707, 731, 859, 913, 934, 931, 905}};
        int startday = 7;

        System.out.println(solution(schedules, timelogs, startday));
    }

    private static int solution(int[] schedules, int[][] timelogs, int startday) {
        int result = 0;
        int[] count = new int[schedules.length];

        // schedules의 시간을 10분 단위로 올림
        for(int x = 0; x < schedules.length; x++) {
            if (schedules[x] % 100 >= 50) schedules[x] += 50 ;
            else schedules[x] += 10;
        }

        // 7일 동안 출근 시간과 스케줄을 비교하여 count 배열에 출근한 날 수를 저장
        for(int i = 0; i < 7; i++) {
            System.out.println(startday);
            if (startday == 6 || startday == 7) {
                startday++;
                if (startday >= 8) startday = 1;
                continue;
            }

            for(int x = 0; x < schedules.length; x++) {
                if (timelogs[x][i] <= schedules[x]) count[x]++;
            }
            startday++;
            if (startday >= 8) startday = 1;
        }

        // count 배열에서 5 이상인 직원의 수를 result에 저장
        for(int i = 0; i < schedules.length; i++) {
            if (count[i] >= 5) result++;
        }
        
        return result;
    }
}