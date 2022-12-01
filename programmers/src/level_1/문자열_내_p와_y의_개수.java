package level_1;

public class 문자열_내_p와_y의_개수 {

	public static void main(String[] args) {
		
		String s = "pPoooyY";
		
		System.out.println(solution(s));

	}

	private static boolean solution(String s) {
		int pCnt = 0;
		int yCnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				pCnt++;
			} else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				yCnt++;
			}
		}
		if(pCnt == yCnt) return true;
		
		return false;
	}

}
