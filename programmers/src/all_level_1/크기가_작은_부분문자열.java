package all_level_1;

import java.util.Arrays;

public class 크기가_작은_부분문자열 {

    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        
        System.out.println(solution(t, p));
    }

    private static int solution(String t, String p) {
        int result = 0;

        // tt의 길이는 int보다 길어질 수 있으니 long으로 설정
        // 부분문자열이 작거나 같은 수를 찾으면 result++
        for(int i = 0; i <= t.length() - p.length(); i++) {
            Long tt = Long.valueOf(t.substring(i, i + p.length()));
            long pp = Long.valueOf(p);
            if(tt <= pp ) {
                result++;
            }
        }

        return result;
    }
    
}
