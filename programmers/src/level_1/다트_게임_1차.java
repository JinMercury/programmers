package level_1;

import java.util.Arrays;

public class 다트_게임_1차 {

	public static void main(String[] args) {
		
		String dartResult = "1S*2T*3S";
		
		System.out.println(solution(dartResult));

	}

	private static int solution(String dartResult) {
		int answer = 0;
		int[] num = new int[3];
		String before = "";
		String[] result = dartResult.split("");
		
		for(int i = 0, j = 0; i < result.length; i+=2, j++) {
			num[j] = Integer.valueOf(result[i]);
			
			if(result[i].equals("1") && result[i+1].equals("0")) {
				num[j] = 10;
				i++;
			}
			if(result[i + 1].equals("S")) num[j] = (int)Math.pow(num[j], 1);
			if(result[i + 1].equals("D")) num[j] = (int)Math.pow(num[j], 2);
			if(result[i + 1].equals("T")) num[j] = (int)Math.pow(num[j], 3);
			
			if(i + 2 < result.length && result[i + 2].equals("#")) {
				num[j] *= -1;
				before = "#";
				i++;
			} else if (i + 2 < result.length &&  result[i + 2].equals("*")) {
				if(before.equals("#") && j != 0) {
					num[j-1] *= 2;
					num[j] *= 2;
				} else if(before.equals("*") && j != 0) {
					num[j-1] *= 2;
					num[j] *= 2;
				} else {
					if(j != 0) {
						num[j] *= 2;
						num[j-1] *= 2;
					} else {
						num[j] *= 2;
					}
				}
				before = "*";
				i++;
			}
			
		}
		System.out.println(Arrays.toString(num));
		for(int i : num) {
			answer += i;
		}
		
		return answer;
	}

}
