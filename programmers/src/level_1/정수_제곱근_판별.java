package level_1;

public class 정수_제곱근_판별 {

	public static void main(String[] args) {
		
		long n = 121;
		
		System.out.println(solution(n));

	}

	private static long solution(long n) {
		long answer = 0;
		double num = Math.sqrt(n);
		
		if(num % 1 == 0) {
			answer = (long)Math.pow((long)(num + 1), 2);
		} else {
			answer = -1;
		}
		
		return answer;
	}

}
