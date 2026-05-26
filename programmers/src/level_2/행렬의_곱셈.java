package level_2;

import java.util.Arrays;

public class 행렬의_곱셈 {

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3}, {4,5,6}};
        int[][] arr2 = {{1,4}, {2,5}, {3,6}};
        
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2[0].length];

        // arr1 열 arr2 행을 곱한 값을 result에 저장
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int x = 0; x < arr1[0].length; x++) {
                    result[i][j] += arr1[i][x] * arr2[x][j];
                    // System.out.println(arr1[i][x] * arr2[x][j]);
                }
            }
        }

        return result;
    }
    /* 제미나이 코드리뷰
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        // 결과 행렬의 크기: (arr1의 행 수) x (arr2의 열 수)
        int row1 = arr1.length;
        int col1 = arr1[0].length;
        int col2 = arr2[0].length;
        
        int[][] result = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                // k는 arr1의 열이자 arr2의 행을 순회
                for (int k = 0; k < col1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return result;
    }
    */
    
}
