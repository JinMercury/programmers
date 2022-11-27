package level_1;

public class 핸드폰_번호_가리기 {

	public static void main(String[] args) {
		
		String phone_number = "01033334444";
		
		System.out.println(solution(phone_number));

	}

	private static String solution(String phone_number) {
		String answer = "";
		StringBuilder sb = new StringBuilder(128);
		sb.append(phone_number.substring(phone_number.length()-4, phone_number.length()));
		
		while(sb.length() < phone_number.length()) {
			sb.insert(0, "*");
		}
		sb.trimToSize();
		answer = sb.toString();
		
		return answer;
	}

}
