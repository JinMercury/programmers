package all_level_1;

import java.util.*;

public class 개인정보_수집_유효기간 {

    public static void main(String[] args) {
        String today = "2009.12.28";
        String[] terms = {"A 13"};
        String[] privacies = {"2008.11.03 A"};
        
        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }

    private static int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> arr = new ArrayList<>();

        // terms 맵에 저장
        Map<String, Integer> map = new HashMap<>();
        for(String term : terms) {
            map.put(term.split(" ")[0], Integer.valueOf(term.split(" ")[1]));
        }

        int i = 0;
        for(String pri : privacies) {
            i++;
            // privacies를 개인정보 수집 일자와 약관 종류로 나눠 유효기간 계산
            String day = pri.split(" ")[0];
            String alpha = pri.split(" ")[1];

            String[] dayArr = day.split("\\.");
            if(Integer.valueOf(dayArr[1]) + map.get(alpha) > 12) {
                dayArr[0] = String.valueOf(Integer.valueOf(dayArr[0]) + (Integer.valueOf(dayArr[1]) + map.get(alpha)) / 12);
                dayArr[1] = String.valueOf((Integer.valueOf(dayArr[1]) + map.get(alpha)) % 12);
                if(dayArr[1].equals("0")) {
                    dayArr[0] = String.valueOf(Integer.valueOf(dayArr[0]) - 1);
                    dayArr[1] = "12";
                }
            } else {
                dayArr[1] = String.valueOf(Integer.valueOf(dayArr[1]) + map.get(alpha));
            }
            
            // 오늘 날짜와 개인정보 수집 일자를 비교해 유효기간이 지났는지 체크 후 파기
            if(Integer.valueOf(today.split("\\.")[0]) > Integer.valueOf(dayArr[0])) {
                arr.add(i);
                continue;
            } else if(Integer.valueOf(today.split("\\.")[0]).equals(Integer.valueOf(dayArr[0]))
                && Integer.valueOf(today.split("\\.")[1]) > Integer.valueOf(dayArr[1])) {
                arr.add(i);
                continue;
            } else if(Integer.valueOf(today.split("\\.")[0]).equals(Integer.valueOf(dayArr[0]))
                && Integer.valueOf(today.split("\\.")[1]) == Integer.valueOf(dayArr[1])
                && Integer.valueOf(today.split("\\.")[2]) >= Integer.valueOf(dayArr[2])) {
                arr.add(i);
                continue;
            }
        }

        Integer[] resultArr = arr.toArray(new Integer[arr.size()]);
        int[] result = Arrays.stream(resultArr).mapToInt(Integer::intValue).toArray();
        return result;
    }
    
}
