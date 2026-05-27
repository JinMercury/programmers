package level_2;

import java.util.*;

public class 전화번호_목록 {

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        
        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {
        boolean result = true;
        
        // 비슷한 값 정렬
        Arrays.sort(phone_book);
        // System.out.println(Arrays.toString(phone_book));
        
        // 붙어있는 값 비교
        for(int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                result = false;
            }
        }

        return result;
    }
    
}
/* 제미나이 코드 리뷰 hash를 사용한 버전

public boolean solution(String[] phone_book) {
    HashMap<String, Integer> map = new HashMap<>();

    // 모든 번호를 해시에 저장
    for (String number : phone_book) {
        map.put(number, 1);
    }

    // 각 번호의 접두어가 해시에 존재하는지 확인
    // 119 라면 1, 11, 119가 해시맵에 있는지 체크
    for (String number : phone_book) {
        for (int j = 1; j < number.length(); j++) {
            if (map.containsKey(number.substring(0, j))) {
                return false;
            }
        }
    }
    return true;
}
*/