package level_1;

public class 서울에서_김서방_찾기 {

	public static void main(String[] args) {
		
		String[] seoul = { "Jane", "Kim" };
		
		System.out.println(solution(seoul));

	}

	private static String solution(String[] seoul) {
		int answer = 0;
		
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer = i;
				break;
			}
		}
		
		return "김서방은 " + answer + "에 있다";
	}

}
