package level_1;

public class 문자열_내림차순으로_배치하기 {

	public static void main(String[] args) {
		
		String s = "Zbcdefgg";
		
		System.out.println(solution(s));

	}

	private static String solution(String s) {
		StringBuilder answer = new StringBuilder(512);
		
		for(int i = 0; i < s.length(); ) {
			char c = s.charAt(i);
			for(int j = 0; j < s.length(); j++) {
				if(c < s.charAt(j)) {
					c = s.charAt(j);
				}
			}
			s = s.replaceFirst(String.valueOf(c), "");
			answer.append(c);
			if(s.length() == 0) break;
		}

		return answer.toString();
	}

}
