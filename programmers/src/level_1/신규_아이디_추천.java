package level_1;

public class 신규_아이디_추천 {
	
	public static String solution(String new_id) {
		String answer = "";
		
		answer = new_id.toLowerCase();
		answer = answer.replaceAll("[^a-z\\d\\-_.]*", "");
		answer = answer.replaceAll("\\.{2,}",  ".");
		answer = answer.replaceAll("^[.]|[.]$", "");
		answer = answer.length() == 0 ? "a" : answer;
		
		if (16 <= answer.length()) {
			answer = answer.substring(0, 15).replaceAll("^[.]|[.]$", "");
		}
		
		while(answer.length() <= 2) {
			answer += answer.charAt(answer.length() - 1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		System.out.println(solution(new_id));

	}

}
