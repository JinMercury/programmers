package all_level_1;

import java.util.*;

public class 추억_점수 {

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }

    private static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];

        // HashMap에 이름, 그리움 점수 저장
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        // yearning 배열의 이름에 따라 점수 저장
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                result[i] += map.getOrDefault(photo[i][j], 0);
            }
        }
        
        return result;
    }

}