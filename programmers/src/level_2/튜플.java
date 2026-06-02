package level_2;

import java.util.*;

public class 튜플 {

    public static void main(String[] args) {
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";

        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        // 문자열에서 숫자만 추출하여 2차원 배열로 저장
        String[] temp = s.substring(2, s.length() - 2).split("\\},\\{");
        int[][] sArr = new int[temp.length][];

        for(int i = 0; i < temp.length; i++) {
            String[] numbers = temp[i].split(",");
            sArr[i] = new int[numbers.length];
            for(int j = 0; j < numbers.length; j++) {
                sArr[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        // 2차원 배열을 길이 기준으로 정렬
        Arrays.sort(sArr, (a, b) -> Integer.compare(a.length, b.length));

        // 배열에서 중복되지 않는 수만 result 배열에 저장
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < sArr.length; i++) {
            for(int j = 0; j < sArr[i].length; j++) {
                if(!arr.contains(sArr[i][j])) {
                    arr.add(sArr[i][j]);
                }
            }
        }

        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
    
}
