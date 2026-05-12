package all_level_1;

import java.util.*;

public class 가장_가까운_같은_글자 {

    public static void main(String[] args) {
        String s = "banana";
        
        System.out.println(Arrays.toString(solution(s)));
    }

    private static int[] solution(String s) {
        int[] result = new int[s.length()];

        for(int i = 0; i < s.length(); i++) {
            int count = 0;
            for(int j = i - 1; j >= 0; j--) {
                count++;
                if(s.charAt(i) == s.charAt(j)) {
                    result[i] = count;
                    break;
                }
            }
            if(result[i] == 0) result[i] = -1;
        }

        return result;
    }
    
}
