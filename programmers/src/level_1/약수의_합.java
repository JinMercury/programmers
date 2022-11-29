package level_1;

public class 약수의_합 {

	public static void main(String[] args) {
		
		int n = 12;
		
		System.out.println(solution(n));

	}

	private static int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= (int)Math.sqrt(n); i++){
			if(n % i == 0) {
				answer += i;
				if(n / i != i) {
					answer += n / i;
				}
			}
		}
		return answer;
	}

}
