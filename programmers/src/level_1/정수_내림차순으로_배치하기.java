package level_1;

import java.util.*;

public class 정수_내림차순으로_배치하기 {

	public static void main(String[] args) {
		
		long n = 118372;
		
		System.out.println(solution(n));

	}

	private static long solution(long n) {
		long answer = 0;
		String num = String.valueOf(n);
		String[] nArr = num.split("");
		StringBuilder sb = new StringBuilder(1024);
		
		Arrays.sort(nArr, Collections.reverseOrder());
		
		for(int i = 0; i < nArr.length; i++) {
			sb.append(nArr[i]);
		}
		answer = Long.valueOf(sb.toString());
		
		return answer;
	}

}
