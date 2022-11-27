package level_1;

import java.util.*;

public class x만큼_간격이_있는_n개의_숫자 {

	public static void main(String[] args) {

		int x = -4; int n = 2;
		long[] answer = solution(x, n);
		
		System.out.println(Arrays.toString(answer));

	}
	
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		for(int i = 0; i < n; i++) {
			answer[i] = (long)(i+1) * x;
		}
		
		return answer;
	}

}
