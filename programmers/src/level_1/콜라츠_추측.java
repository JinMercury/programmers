package level_1;

public class 콜라츠_추측 {

	public static void main(String[] args) {

		int num = 626331;
		
		System.out.println(solution(num));

	}

	private static int solution(int num) {
		int answer = 0;
		long idx = num;
		
		for(int i = 0; i < 500; i++) {
			if(idx == 1) break;
			if(idx % 2 == 0) {
				idx /= 2;
			} else {
				idx = idx * 3 + 1;
			}
			answer++;
		}
		if(idx != 1) answer = -1;
		
		return answer;
	}

}
