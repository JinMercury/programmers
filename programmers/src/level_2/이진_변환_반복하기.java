package level_2;

import java.util.Arrays;

public class 이진_변환_반복하기 {

    public static void main(String[] args) {

        String s = "110010101001";
        int[] answer = solution(s);

        System.out.println(Arrays.toString(answer));

    }

    private static int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb = new StringBuilder(512);
        sb.append(s);

        while(!s.equals("1")) {
            if(sb.equals("1")) break;
            for(int i = 0; i < sb.length(); ){
                if(sb.charAt(i) == '0') {
                    sb.deleteCharAt(i);
                    answer[1]++;
                } else {
                    i++;
                }
            }
            s = Integer.toBinaryString(sb.length());
            sb.delete(0, sb.length());
            sb.append(s);
            answer[0]++;
        }

        return answer;
    }
    
}
