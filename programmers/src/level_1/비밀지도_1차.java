package level_1;

import java.util.Arrays;

public class 비밀지도_1차 {

	public static void main(String[] args) {
		
		int n = 6; int[] arr1 = {46, 33, 33 ,22, 31, 50}; int[] arr2 = {27 ,56, 19, 14, 14, 10};
		String[] answer = solution(n, arr1, arr2);
		
		System.out.println(Arrays.toString(answer));

	}

	private static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for(int i = 0; i < arr1.length; i++) {
			answer[i] = String.valueOf(Long.valueOf(Long.toString(arr1[i], 2)) + Long.valueOf(Long.toString(arr2[i], 2)));
			while(answer[i].length() != n) {
				answer[i] = "0" + answer[i];
			}
			answer[i] = answer[i].replaceAll("1", "#");
			answer[i] = answer[i].replaceAll("2", "#");
			answer[i] = answer[i].replaceAll("0", " ");
		}
		
		return answer;
	}

}
