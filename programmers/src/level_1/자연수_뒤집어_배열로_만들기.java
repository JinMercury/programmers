package level_1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {

	public static void main(String[] args) {
		
		long n = 12345;
		int[] answer = solution(n);
		
		System.out.println(Arrays.toString(answer));

	}

	private static int[] solution(long n) {

		String num = String.valueOf(n);
		String[] nArr = num.split("");
		int[] answer = new int[nArr.length];
		
		for(int i = nArr.length - 1, j = 0; i >= 0; i--, j++) {
			answer[j] = Integer.valueOf(nArr[i]); 
		}
		
		return answer;
	}

}
