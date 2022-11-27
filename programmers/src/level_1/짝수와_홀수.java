package level_1;

public class 짝수와_홀수 {

	public static void main(String[] args) {
		
		int num = 3;
		
		System.out.println(solution(num));

	}

	private static String solution(int num) {
		
		if(num % 2 == 0) {
			return "Even";
		}
		return "Odd";
	}

}
