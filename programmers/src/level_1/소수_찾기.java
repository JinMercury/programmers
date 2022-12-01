package level_1;

public class 소수_찾기 {

	public static void main(String[] args) {

		int n = 15;
		
		System.out.println(solution(n));

	}

	private static int solution(int n) {
		int answer = 0;
		
		for(int i = 2; i <= n; i++) {
			if(i != 2 && i % 2 == 0) continue;
			else if(i != 3 && i % 3 == 0) continue;
			else if(isPrime(i)) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= (int)Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
