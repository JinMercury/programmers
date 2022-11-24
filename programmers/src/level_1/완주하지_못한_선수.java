package level_1;

import java.util.*;

public class 완주하지_못한_선수 {

	public static void main(String[] args) {

		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		
		System.out.println(sol(participant, completion));

	}

	private static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
		}
		if(answer.equals("")) {
			answer = participant[participant.length - 1];
		}
		
		return answer;
	}
	
	private static String sol(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> result = new HashMap<>();
		for(String str : participant) result.put(str, result.getOrDefault(str, 0) + 1);
		for(String str : completion) result.put(str, result.get(str) - 1);
		
		for(String key : result.keySet()) {
			if(result.get(key) != 0) {
				answer = key;
			}
		}
		
		return answer;
	}

}
