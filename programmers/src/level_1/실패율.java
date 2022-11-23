package level_1;

import java.util.*;

public class 실패율 {

	public static void main(String[] args) {
		
		 int N = 5; int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		 int[] answer = solution(N, stages);
		 
		 System.out.println(Arrays.toString(answer));

	}

	private static int[] solution(int N, int[] stages) {
		ArrayList<Double> fail = new ArrayList<>();
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			int total = 0;
			int cnt = 0;
			
			for(int j = 0; j < stages.length; j++) {
				if(stages[j] >= i) total++;
				if(stages[j] == i) cnt++;
			}
			if(total == 0) fail.add(0.0);
			else fail.add((cnt / (double)total));
		}
		System.out.println(fail);
		
		for(int j = 0; j < fail.size(); j++) {
			int maxNum = 0;
			double max = -1;
			for(int i = 0; i < fail.size(); i++) {
				if(max < fail.get(i)) {
					max = fail.get(i);
					maxNum = i;
				}
			}
			fail.set(maxNum, -1.0);
			System.out.println(fail);
			num.add(maxNum+1);
		}
		int[] answer = new int[num.size()];
		for(int i = 0; i < num.size(); i++) {
			answer[i] = num.get(i);
		}
		
		return answer;
	}

}
