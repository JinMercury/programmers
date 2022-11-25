package level_1;

import java.util.Arrays;

public class 예산 {

	public static void main(String[] args) {
		
		int[] d = { 1, 3, 2, 5, 4 }; int budget = 9;
		
		System.out.println(solution(d, budget));

	}

	private static int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		
		for(int i = 0; i < d.length; i++) {
			if(budget >= d[i]) {
				answer++;
				budget -= d[i];
			}
		}
		
		return answer;
	}

}
