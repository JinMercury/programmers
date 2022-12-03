package level_1;

public class 가운데_글자_가져오기 {

	public static void main(String[] args) {
		String s = "qwer";
		
		System.out.println(solution(s));

	}

	private static String solution(String s) {
		StringBuilder answer = new StringBuilder(128);
		
		if(s.length() % 2 == 0) {
			answer.append(s.charAt(s.length() / 2 - 1));
		}
		answer.append(s.charAt(s.length() / 2));
		
		return answer.toString();
	}

}
