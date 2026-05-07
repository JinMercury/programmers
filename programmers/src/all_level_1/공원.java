package all_level_1;

import java.util.*;

public class 공원 {

    public static void main (String[] args){
        int[] mats = {5, 3, 2};
        String[][] park = {{"A", "A", "-1", "B", "B", "B", "B", "-1"}, 
        {"A", "A", "-1", "B", "B", "B", "B", "-1"}, 
        {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, 
        {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, 
        {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, 
        {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};

        System.out.println(solution(mats, park));
    }

    private static int solution(int[] mats, String[][] park) {
        int result = -1;
        Arrays.sort(mats);

        // mats를 깔 수 있는지 큰 순서대로 체크, 가능하면 result에 mat값 저장
        for (int i = mats.length - 1; i >= 0; i--) {
            int matSize = mats[i];
            boolean canPlaceMat = false;

            for (int x = 0; x <= park.length - matSize; x++) {
                for (int y = 0; y <= park[0].length - matSize; y++) {
                    boolean isEmpty = true;

                    for (int r = x; r < x + matSize; r++) {
                        for (int c = y; c < y + matSize; c++) {
                            if (!park[r][c].equals("-1")) {
                                isEmpty = false;
                                break;
                            }
                        }
                        if (!isEmpty) break;
                    }

                    if (isEmpty) {
                        canPlaceMat = true;
                        break;
                    }
                }
                if (canPlaceMat) break;
            }

            if (canPlaceMat) {
                result = matSize;
                break;
            }
        }

        return result;
    }
    
}
