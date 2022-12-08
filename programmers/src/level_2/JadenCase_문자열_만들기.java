package level_2;

import java.util.*;

public class JadenCase_문자열_만들기 {

    public static void main(String[] args) {
        String s = "3people unFollowed me";

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuilder answer = new StringBuilder(1024);
        answer.append(s);

        if(answer.charAt(0) >= 97 && answer.charAt(0) <= 122) {
                char ch = (char)(answer.charAt(0) - 32);
                answer.deleteCharAt(0);
                answer.insert(0, String.valueOf(ch));
            }
        
        for(int i = 1; i < answer.length(); i++) {
            if(i == answer.length() - 1 && answer.charAt(i) == ' ') continue;
            
            if(answer.charAt(i) == ' ' && answer.charAt(i + 1) != ' ' 
                && answer.charAt(i + 1) >= 97 && answer.charAt(i + 1) <= 122) {
                    char ch = (char)(answer.charAt(i + 1) - 32);
                    answer.deleteCharAt(i+1);
                    answer.insert(i + 1, String.valueOf(ch));
            } else if(answer.charAt(i - 1) != ' ' && answer.charAt(i) >= 65 && answer.charAt(i) <= 90){
                char ch = (char)(answer.charAt(i) + 32);
                answer.deleteCharAt(i);
                answer.insert(i, String.valueOf(ch));
            }
        }

        return answer.toString();
    }
    
}
