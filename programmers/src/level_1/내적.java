package level_1;

public class 내적 {
	
	public static int solution(int n) {
		int answer = 0;
		StringBuilder sb = new StringBuilder(1024);
		
		String third = Integer.toString(n, 3);
		sb.append(third);
		sb.reverse();
		answer = Integer.parseInt(sb.toString(), 3);
		
		return answer;
	}

	public static void main(String[] args) {
		
		int n = 45;
		
		System.out.println(solution(n));

	}

}
