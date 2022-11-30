package level_1;

public class 문자열을_정수로_바꾸기 {

	public static void main(String[] args) {
		String s = "+1234";
		
		System.out.println(solution(s));

	}

	private static int solution(String s) {
		
		int answer = 0;
		
		for(int i = s.length() - 1, j = 0; i >= 0; i--,j++) {
			if(s.charAt(i) == '-') {
				answer *= -1;
				continue;
			} else if(s.charAt(i) == '+'){
				continue;
			}
			answer += (s.charAt(i) - 48) * (int)Math.pow(10, j);
		}
		
		return answer;
	}

}
