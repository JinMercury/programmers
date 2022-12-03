package level_1;

public class 문자열_나누기 {

	public static void main(String[] args) {
		String s = "abracadabra";
		
		System.out.println(solution(s));

	}

	private static int solution(String s) {
		int answer = 0;
		
		for(int i = 0; i < s.length(); ) {
			char a = s.charAt(i);
			int cnt1 = 0; int cnt2 = 0;
			
			for(int j = i; j < s.length(); j++) {
				if(s.charAt(j) == a) cnt1++;
				if(s.charAt(j) != a) cnt2++;
				
				if(cnt1 == cnt2) {
					answer++;
					i += cnt1+cnt2;
					break;
				} else if(j == s.length() - 1 && cnt1 != cnt2) {
					answer++;
					i += cnt1+cnt2;
					break;
				}
			}
			
		}
		
		return answer;
	}

}
