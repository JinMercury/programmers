package level_2;

import java.util.*;

public class 뉴스_클러스터링 {

    public static void main(String[] args) {
        String str1 = "abab";
        String str2 = "baba";

        System.out.println(solution(str1, str2));
    }

    public static int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // 각 문자열에서 길이가 2인 부분 문자열 추출
        for(int i = 0; i < str1.length() - 1; i++) {
            String s = str1.substring(i, i + 2);
            if (s.matches("[a-z]{2}")) {
                list1.add(s);
            }
        }
        for(int i = 0; i < str2.length() - 1; i++) {
            String s = str2.substring(i, i + 2);
            if (s.matches("[a-z]{2}")) {
                list2.add(s);
            }
        }
        // System.out.println(str1 + " : " + list1);
        // System.out.println(str2 + " : " + list2);

        // 두 리스트가 모두 비어있는 경우 65536 리턴
        if(list1.size() == 0 && list2.size() == 0) {
            return 65536;
        }

        // 교집합과 합집합을 구해 자카드 계산
        int cnt = 0;
        for(int i = 0; i < list1.size(); i++) {
            String s = list1.get(i);
            if (list2.contains(s)) {
                cnt++;
                list2.remove(s);
            }
        }
        double jac = (double) cnt / (list1.size() + list2.size());
        // System.out.println(list1.size() + " : " + list2.size() + " : " + cnt + " : " + jac);

        return (int) (jac * 65536);
    }
    
}

/* 제미나이 코드 리뷰
import java.util.*;

public class 뉴스_클러스터링 {

    public static int solution(String str1, String str2) {
        // 1. 소문자 변환 및 리스트 생성 (메서드 분리)
        List<String> list1 = makeTokenList(str1.toLowerCase());
        List<String> list2 = makeTokenList(str2.toLowerCase());

        // 2. 예외 처리: 모두 공집합인 경우
        if (list1.isEmpty() && list2.isEmpty()) {
            return 65536;
        }

        // 3. 교집합 크기 구하기
        int intersection = 0;
        // list2를 복사하여 원본 훼손 방지 (원본을 써도 무방하다면 생략 가능)
        List<String> copyList2 = new ArrayList<>(list2); 
        
        for (String s : list1) {
            if (copyList2.remove(s)) { // remove(Object)는 삭제 성공 시 true 반환
                intersection++;
            }
        }

        // 4. 합집합 크기 계산: |A ∪ B| = |A| + |B| - |A ∩ B|
        int union = list1.size() + list2.size() - intersection;

        // 5. 결과 계산
        double jac = (double) intersection / union;
        return (int) (jac * 65536);
    }

    private static List<String> makeTokenList(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);

            // regex 대신 char 범위 체크가 성능상 약간 더 유리할 수 있음
            if (c1 >= 'a' && c1 <= 'z' && c2 >= 'a' && c2 <= 'z') {
                list.add("" + c1 + c2);
            }
        }
        return list;
    }
}
*/