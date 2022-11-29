package level_1;

import java.util.Arrays;

public class 이상한_문자_만들기 {

	public static void main(String[] args) {
		
		String s = " tRy hello  WORLD    ";
		
		System.out.println(solution(s));

	}

	private static String solution(String s) {
		String[] sArr = s.split(" ", -1);
		StringBuilder sb = new StringBuilder(512);
		StringBuilder answer = new StringBuilder(512);
		System.out.println(Arrays.toString(sArr));
		
		for(int i = 0; i < sArr.length; i++) {
			sb.append(sArr[i]);
			for(int j = 0; j < sArr[i].length(); j++) {
				if(j % 2 == 0) {
					if(sArr[i].charAt(j) > 96) {
						int idx = (sArr[i].charAt(j) - 32);
						sb.insert(j, (char)idx);
						sb.deleteCharAt(j + 1);
					}
				} else {
					if(sArr[i].charAt(j) < 96) {
						int idx = (sArr[i].charAt(j) + 32);
						sb.insert(j, (char)idx);
						sb.deleteCharAt(j + 1);
					}
				}
			}
			answer.append(sb);
			if(i != sArr.length - 1) answer.append(" ");
			sb.delete(0, sb.length());
		}
		
		return answer.toString();
	}

}
