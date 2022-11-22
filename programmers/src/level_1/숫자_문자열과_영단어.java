package level_1;

public class 숫자_문자열과_영단어 {
	
	public static int solution(String s) {
		int answer = 0;
		String[] num = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for(int i = 0; i < 10; i++) {
			if(s.contains(num[i])) {
				s = s.replaceAll(num[i], String.valueOf(i));
			}
		}
		answer = Integer.valueOf(s);
		
		return answer;
	}

	public static void main(String[] args) {
		
		String s = "one4seveneight";
		
		System.out.println(solution(s));

	}

}
