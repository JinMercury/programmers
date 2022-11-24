package level_1;

import java.util.*;

public class K번째수 {

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} };
		
		System.out.println(Arrays.toString(solution(array, commands)));

	}

	private static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < commands.length; i++) {
			for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
				num.add(array[j]);
			}
			Collections.sort(num);
			answer[i] = num.get(commands[i][2] - 1);
			num.clear();
		}

		return answer;
	}

}
