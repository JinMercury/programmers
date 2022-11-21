package level_1;

import java.util.*;

public class 숫자_짝꿍 {
	
	public static String solution(String X, String Y) {
		int[] xArr = new int[10];
		int[] yArr = new int[10];
		StringBuilder answer = new StringBuilder(1024);
		answer.setLength(0);
		String result = "";
		
		for(int i = 0; i < X.length(); i++) {
			xArr[X.charAt(i) - 48]++;
		}
		for(int i = 0; i < Y.length(); i++) {
			yArr[Y.charAt(i) - 48]++;
		}
		
		for(int i = 9; i >= 0; i--) {
			int temp = 0;
			if(xArr[i] > yArr[i]) {
				temp = yArr[i];
			} else {
				temp = xArr[i];
			}
			if(i == 0 && answer.length() == 0 && temp > 0) {
				return "0";
			}
			
			for(int j = 0; j < temp; j++) {
				answer.append(i);
			}
		}
		if(answer.length() == 0) {
			return "-1";
		}
		result = answer.toString();
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(solution("100", "2345"));

	}

}
