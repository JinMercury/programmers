package level_2;

import java.util.*;

public class 모음사전 {

    public static void main(String[] args) {
        String word = "AAAE";

        System.out.println(solution(word));
    }

    public static int solution(String word) {
        int result = 0;

        // 최대 길이가 5인 모든 조합의 수 계산
        int max = 0;
        for (int i = 1; i <= 5; i++) {
            max += Math.pow(5, i);
        }
        // System.out.println("max: " + max);

        // 입력된 단어의 각 문자에 대해 위치 계산
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if(c == 'A') {
                result += 1;
            } else if (c == 'E') {
                result += (int) (max / Math.pow(5, i + 1)) + 1;
            } else if (c == 'I') {
                result += (int) (max / Math.pow(5, i + 1)) * 2 + 1;
            } else if (c == 'O') {
                result += (int) (max / Math.pow(5, i + 1)) * 3 + 1;
            } else if (c == 'U') {
                result += (int) (max / Math.pow(5, i + 1)) * 4 + 1;
            }
        }

        return result;
    }
    
}
