package all_level_1;

public class 택배_상자_꺼내기 {
    public static void main (String[] args){
        int n = 13;
        int w = 3;
        int num = 6;
        
        System.out.println(solution(n, w, num));
    }

    private static int solution(int n, int w, int num) {
        int result = 0;
        int[][] line = new int[n/w+1][w];
        int cnt = 1;

        for (int i = 0; i < line.length; i++) {
            if(i % 2 == 1) {
                for (int j = w - 1; j >= 0; j--) {
                    if (cnt > n) break;
                    line[i][j] = cnt++;
                }
            } else {
                for (int j = 0; j < w; j++) {
                    if (cnt > n) break;
                    line[i][j] = cnt++;
                }
            }
        }

        int check = 0;
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].length; j++) {
                if(line[i][j] == num) {
                    check = i;
                    break;
                }
            }
        }

        int rem = 0;
        for (int i = 0; i < line[0].length; i++) {
            rem++;
            if (line[check][i] == num) break;
        }

        for (int i = check; i < line.length; i++) {
            if (line[i][rem-1] != 0 && line[i][rem-1] >= num) {
                result++;
            }
        }

        /*
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].length; j++) {
                System.out.print(line[i][j]);
            }
            System.out.println();
        }
        */

        return result;
    }
}
