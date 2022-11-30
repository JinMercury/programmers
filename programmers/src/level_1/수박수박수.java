package level_1;

public class 수박수박수 {

	public static void main(String[] args) {
		int n = 3;
		
		System.out.println(solution(n));

	}

	private static String solution(int n) {
		
		StringBuilder answer = new StringBuilder(1024);
		
		for(int i = 1; i <= n; i++) {
			answer.append(i % 2 == 0 ? "박" : "수");
		}
		
		return answer.toString();
	}

}
