package level_1;

import java.util.*;

public class 완주하지_못한_선수 {

	public static void main(String[] args) {

		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		
		System.out.println(solution(participant, completion));

	}

	private static String solution(String[] participant, String[] completion) {
		String answer = "";
		ArrayList<String> parti = new ArrayList<>();
		
		for(int i = 0; i < participant.length; i++) {
			parti.add(participant[i]);
		}
		for(int i = 0; i < completion.length; i++) {
			if(parti.contains(completion[i])) {
				parti.remove(completion[i]);
			}
		}
		answer = parti.get(0);
		
		return answer;
	}

}
