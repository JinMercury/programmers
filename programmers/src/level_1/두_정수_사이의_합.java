package level_1;

public class 두_정수_사이의_합 {

	public static void main(String[] args) {
		int a = 3; int b = 5;
		
		System.out.println(solution(a, b));

	}

	private static long solution(int a, int b) {
		long answer = 0;
		if(a == b) return a;
		
		int max = 0;
		int min = 0;
		
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		for(int i = min; i <= max; i++) {
			answer += i;
		}

		return answer;
	}

}
