package level_1;

import java.util.*;

public class 제일_작은_수_제거하기 {

	public static void main(String[] args) {
		
		int[] arr = {10};
		int[] answer = solution(arr);
		
		System.out.println(Arrays.toString(answer));

	}

	private static int[] solution(int[] arr) {
		ArrayList<Integer> num = new ArrayList<>();
		int[] answer = new int[arr.length - 1];
		
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == min) continue;
			num.add(arr[i]);
		}
		for(int i = 0; i < answer.length; i++) {
			answer[i] = num.get(i);
		}
		if(answer.length == 0) {
			answer = Arrays.copyOf(answer, 1);
			answer[0] = -1;
		}
		
		return answer;
	}

}
