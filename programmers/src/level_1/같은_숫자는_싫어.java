package level_1;

import java.util.*;

public class 같은_숫자는_싫어 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] answer = solution(arr);
		
		System.out.println(Arrays.toString(answer));

	}

	private static int[] solution(int[] arr) {
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			int n = arr[i];
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] != n) {
					num.add(n);
					i = j - 1;
					break;
				}
			}
		}
		num.add(arr[arr.length - 1]);
		
		int[] answer = new int[num.size()];
		
		for(int i = 0; i < num.size(); i++) {
			answer[i] = num.get(i);
		}
		
		return answer;
	}

}
