package level_1;

public class 음양_더하기 {
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < signs.length; i++) {
			if(signs[i] == true) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		int[] absolutes = { 4, 7, 12 };
		boolean[] signs = { true, false, true };
		
		System.out.println(solution(absolutes, signs));

	}

}
