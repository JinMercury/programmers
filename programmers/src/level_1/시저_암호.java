package level_1;

import java.util.Arrays;

public class 시저_암호 {

	public static void main(String[] args) {
		
		String s = "abcdefghijklmnopqrstuvwxyz"; int n = 4;
		
		System.out.println(solution(s, n));

	}

	private static String solution(String s, int n) {
		StringBuilder sb = new StringBuilder(512);
		char[] cArr = s.toCharArray();
		
		for(char c : cArr) {
			if(c == ' ') {
				sb.append(" ");
			}
			else if(c >= 'A' && c <= 'Z') {
				if(c + n > 'Z') {
					sb.append((char)(64 + n - (90 - c)));
				} else {
					sb.append((char)(c + n));
				}
			} else if(c >= 'a' && c <= 'z') {
				if(c + n > 'z') {
					sb.append((char)(96 + n - (122 - c)));
				} else {
					sb.append((char)(c + n));
				}
			}
		}
		
		return sb.toString();
	}

}
