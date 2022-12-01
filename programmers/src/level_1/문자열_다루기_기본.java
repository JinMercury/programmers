package level_1;

public class 문자열_다루기_기본 {

	public static void main(String[] args) {
		
		String s = "a234";
		
		System.out.println(solution(s));

	}

	private static boolean solution(String s) {
		
		if(s.length() == 4 || s.length() == 6) {
		
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
			}
		} else {
			return false;
		}
		
		return true;
	}

}
