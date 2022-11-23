package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 두_개_뽑아서_더하기 {
	
	public static int[] solution(int[] numbers) {
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				if(!num.contains(numbers[i] + numbers[j])) {
					num.add(numbers[i] + numbers[j]);
				}
			}
		}
		Collections.sort(num);
		
		int[] answer = new int[num.size()];
		for(int i = 0; i < num.size(); i++) {
			answer[i] = num.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		
		int[] numbers = {2, 1, 3, 4 ,1};
		
		System.out.println(Arrays.toString(solution(numbers)));

	}

}
