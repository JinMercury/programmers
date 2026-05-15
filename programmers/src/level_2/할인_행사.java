package level_2;

import java.util.*;

public class 할인_행사 {

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        
        System.out.println(solution(want, number, discount));
    }

    private static int solution(String[] want, int[] number, String[] discount) {
        int result = 0;

        // 원하는 제품, 개수를 map에 저장
        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
            max += number[i];
        }
        // System.out.println(map);

        // 특정 일에 원하는 제품과 할인하는 제품의 개수가 같으면 result++
        for(int i = 0; i <= discount.length - max; i++) {
            Map<String, Integer> disMap = new HashMap<>();
            for(int j = i; j < max + i; j++) {
                if(disMap.get(discount[j]) != null) {
                    disMap.put(discount[j], disMap.get(discount[j]) + 1);
                } else {
                    disMap.put(discount[j], 1);
                }
            }
            if(map.equals(disMap)) {
                result++;
            }
            // System.out.println(disMap);
        }

        return result;
    }
    
}
