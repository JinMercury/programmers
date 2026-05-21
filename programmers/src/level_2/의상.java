package level_2;

import java.util.*;

public class 의상 {

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "face"}, {"blue_sunglasses", "face"}
        , {"green_turban", "lace"}};
        
        System.out.println(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        int result = 1;

        // clothes값을 map에 종류와 갯수로 저장
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        // System.out.println(map);
        
        // 옷을 입지 않는 경우를 위해 +1 해서 곱함
        // 모든 부위를 입지 않는 경우를 위해 result - 1
        for (String s : map.keySet()) {
            result *= map.get(s) + 1;
        }

        return result - 1;
    }
    
}
