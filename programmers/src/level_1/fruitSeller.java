package level_1;

import java.util.*;

public class fruitSeller {

	public static void main(String[] args) {
		
		int k = 3;
		int m = 4;
		int[] score = { 1, 2, 3, 1, 2, 3, 1 };
		
		int answer = 0;
		int n = score.length - 1;
		
		int[][] apple = new int[score.length/m][m];
		
		Arrays.sort(score);
		
		for(int i = 0; i < score.length / m; i++) {
			for(int j = 0; j < m; j++) {
				apple[i][j] = score[n];
				n--;
			}
		}
		for(int i = 0; i < apple.length; i++) {
			for(int j = 0; j < apple[0].length; j++) {
				if(j == apple[0].length - 1) {
					answer += apple[i][j] * m; 
				}
			}
		}
	}

}
