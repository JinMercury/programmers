package all_level_1;

import java.util.*;

public class 대충_만든_자판 {

    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        
        System.out.println(Arrays.toString(solution(keymap, targets)));
    }

    private static int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        int[] arr = new int[keymap.length];

        // targets 각 문자열이 최소값을 찾아 result에 저장
        for(int i = 0; i < targets.length; i++) {
            for(int j = 0; j < targets[i].length(); j++) {
                for(int x = 0; x < arr.length; x++) {
                    arr[x] = keymap[x].indexOf(targets[i].charAt(j)) + 1;
                }
                Arrays.sort(arr);

                // 문자열이 하나라도 없으면 문자열을 작성할 수 없으니 -1 저장
                boolean flag = true;
                for(int x = 0; x < arr.length; x++) {
                    if(arr[x] != 0) {
                        flag = false;
                    }
                }
                if(flag) result[i] = -1;

                for(int x = 0; x < arr.length; x++) {
                    if(result[i] != -1 && arr[x] != 0) {
                        result[i] += arr[x];
                        break;
                    }
                }
            }
        }

        return result;
    }
    
}
