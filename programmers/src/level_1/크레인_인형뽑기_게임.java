package level_1;

import java.util.*;

public class 크레인_인형뽑기_게임 {

	public static void main(String[] args) {
		
		int[][] board = { {0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1} };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		
		System.out.println(solution(board, moves));

	}

	private static int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> bucket = new ArrayList<>();
		
		for(int i = 0; i < moves.length; i++) {
			int move = moves[i] - 1;
			for(int j = 0; j < board[0].length; j++) {
				if(board[j][move] != 0) {
					bucket.add(board[j][move]);
					board[j][move] = 0;
					break;
				}
			}
		}
		for(int i = 0; i < bucket.size() - 1; i++) {
			if(bucket.get(i) == bucket.get(i+1)) {
				answer += 2;
				bucket.remove(i); bucket.remove(i);
				i = -1;
			}
		}
		
		return answer;
	}

}
