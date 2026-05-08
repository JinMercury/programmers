package all_level_1;

public class 이웃한_칸 {

    public static void main (String[] args){
        String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, 
        {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;

        System.out.println(solution(board, h, w));
    }

    private static int solution(String[][] board, int h, int w) {
        int result = 0;

        /*
        if(h > 0 && board[h - 1][w].equals(board[h][w])) {
            result++;
        }
        if(h < board.length - 1 && board[h + 1][w].equals(board[h][w])) {
            result++;
        }
        if(w > 0 && board[h][w - 1].equals(board[h][w])) {
            result++;
        }
        if(w < board[0].length - 1 && board[h][w + 1].equals(board[h][w])) {
            result++;
        }
        */

        int n = board.length;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if(board[h][w].equals(board[h_check][w_check])) {
                    result++;
                }
            }
        }

        return result;
    }
    
}
