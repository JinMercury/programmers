package all_level_1;

import java.util.*;

public class 중요한_단어를_스포_방지 {
    public static void main (String[] args){
        String message = "my phone number is 01012345678 and may i have your phone number";
        int[][] spoiler_ranges = {{5, 5}, {25, 28}, {34, 40}, {53, 59}};

        System.out.println(solution(message, spoiler_ranges));
    }

    private static int solution(String message, int[][] spoiler_ranges) {
        int result = 0;
        /*
        String[] message_split = message.split(" ");
        int[][] idx = new int[message_split.length][2];

        // message_split 단어별 시작 인덱스와 끝 인덱스 저장
        int idx_cnt = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                idx[idx_cnt][1] = i - 1;
                idx_cnt++;
                idx[idx_cnt][0] = i + 1;
            }
        }
        idx[idx_cnt][1] = message.length() - 1;

        // 스포일러 범위에 일부분만 포함해도 해당 단어 추출
        List<String> spoiler = new ArrayList<>();
        for (int i = 0; i < spoiler_ranges.length; i++) {
            int start = spoiler_ranges[i][0];
            int end = spoiler_ranges[i][1];

            for (int j = 0; j < message_split.length; j++) {
                int idx_start = idx[j][0];
                int idx_end = idx[j][1];
                if ((idx_start >= start && idx_end <= end) || (idx_start < start && idx_end >= start) || (idx_start <= end && idx_end > end)) {
                    spoiler.add(message_split[j]);
                }
            }
        }
        // spoiler에 포함되지 않는 단어 추출
        List<String> nSpoiler = new ArrayList<>();
        for (int i = 0; i < message_split.length; i++) {
            if (!spoiler.contains(message_split[i])) {
                nSpoiler.add(message_split[i]);
            }
        }
        */

        int idx = 0;
        List<String> spoiler = new ArrayList<>();
        List<String> nSpoiler = new ArrayList<>();
        
        for (String word : message.split(" ")) {
            int start = message.indexOf(word, idx);
            int end = start + word.length() - 1;
            idx = end + 1;
            // 스포일러 범위에 일부분만 포함해도 해당 단어 추출
            boolean isSpoiler = false;
            for (int[] range: spoiler_ranges) {
                if (start <= range[1] && end >= range[0]) {
                    spoiler.add(word);
                    isSpoiler = true;
                    break;
                }
            }
            // 스포일러가 아닌 단어 저장
            if (!isSpoiler) {
                nSpoiler.add(word);
            }
        }

        // importantWord에 포함되지 않고 nSpoiler에도 포함되지 않는 단어 추출
        List<String> importantWord = new ArrayList<>();
        for (int i = 0; i < spoiler.size(); i++) {
            if (!importantWord.contains(spoiler.get(i)) && !nSpoiler.contains(spoiler.get(i))) {
                importantWord.add(spoiler.get(i));
            }
        }
        result = importantWord.size();

        return result;
    }
    
}
