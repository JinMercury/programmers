package level_2;

import java.util.*;

public class 숫자의_표현 {

    public static void main(String[] args) {

        int n = 15;

        System.out.println(solution(n));

    }

    private static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            al.add(i);
        }

        for(int i = 1; i <= n / 2; i++) {
            int idx = 0;
            for(int j = i - 1; j < al.size(); j++) {
                idx += al.get(j);
                if(idx >= n) break;
            }
            if(idx == n) answer++;
        }
        answer++;

        return answer;
    }
    
}
