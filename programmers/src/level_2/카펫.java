package level_2;

import java.util.*;

public class 카펫 {
    
    public static void main(String[] args){

        int brown = 18;
        int yellow = 6;

        int[] answer = solution(brown, yellow);

        System.out.println(Arrays.toString(answer));
    }

    private static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        int i = (int)Math.ceil(Math.sqrt(sum));
        while(true) {
            if(sum % i == 0) {
                if((i-2) * (sum / i - 2) == yellow) {
                    answer[0] = i;
                    answer[1] = sum / i;
                    break;
                }
            }
            i++;
        }

        return answer;
    }

}
