package level_1;

import java.util.*;

public class 나누어_떨어지는_숫자_배열 {

	public static void main(String[] args) {
		int[] arr = { 3,2,6 };
		int divisor = 5;
		
		int[] answer = solution(arr, divisor);
		
		System.out.println(Arrays.toString(answer));

	}

	private static int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				num.add(arr[i]);
			}
		}
		Collections.sort(num);
		
		if(num.size() == 0) {
			int[] answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		
		int[] answer = new int[num.size()];
		
		for(int i = 0; i < num.size(); i++) {
			answer[i] = num.get(i);
		}
		
		return answer;
	}

}
