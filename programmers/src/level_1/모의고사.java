package level_1;

import java.util.*;

public class 모의고사 {

	public static void main(String[] args) {
		
		int[] answers = { 3,3,2,1,5 };
		
		System.out.println(Arrays.toString(solution(answers)));

	}

	private static int[] solution(int[] answers) {
		String one = "12345";
		String two = "21232425";
		String three = "3311224455";
		int[] numAns = new int[3];
		
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == one.charAt(i%5) - '0') {
				numAns[0]++;
			}
			if(answers[i] == two.charAt(i%8) - '0') {
				numAns[1]++;
			}
			if(answers[i] == three.charAt(i%10) - '0') {
				numAns[2]++;
			}
		}
		
		int max = Math.max(numAns[0], Math.max(numAns[1], numAns[2]));
		ArrayList<Integer> idx = new ArrayList<>();
		
		for(int i = 0; i < numAns.length; i++) {
			if(max == numAns[i]) {
				idx.add(i+1);
			}
		}
		
		int[] answer = new int[idx.size()];
		for(int i = 0; i < idx.size(); i++) {
			answer[i] = idx.get(i);
		}
		
		return answer;
	}

}
