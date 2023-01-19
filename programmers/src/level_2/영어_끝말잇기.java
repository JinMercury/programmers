package level_2;

import java.util.*;

public class 영어_끝말잇기 {
    
    public static void main(String[] args){

        int n = 2;
        String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };

        int[] answer = solution(n, words);
        System.out.println(Arrays.toString(answer));

    }

    private static int[] solution(int n, String[] words) {
        int[] answer = { 0, 0 };
        ArrayList<String> al = new ArrayList<>();
        
        for(int i = 0; i < words.length; i++){
            if(words[i].length() <= 1) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            if(i >= 1 && words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            if(al.contains(words[i])){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            al.add(words[i]);
        }
        
        return answer;
    }

}
