package level_1;

import java.util.*;

public class 명예의_전당_1 {

	public static void main(String[] args) {

		int k = 4; int[] score = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };
		
		int[] answer = sol(k, score);
		
		System.out.println(Arrays.toString(answer));

	}

	private static int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		ArrayList<Integer> honor = new ArrayList<>();
		int x = (k > score.length) ? score.length : k;
		
		for(int i = 0; i < x; i++) {
			honor.add(score[i]);
			Collections.sort(honor);
			answer[i] = honor.get(0);
		}
		
		for(int i = x; i < score.length; i++) {
			
			if(score[i] > honor.get(0) && honor.size() == k) {
				honor.remove(0);
				honor.add(score[i]);
			}
			Collections.sort(honor);
			answer[i] = honor.get(0);
		}
		
		return answer;
	}
	
	private static int[] sol(int k, int[] score) {
		int[] answer = new int[score.length];
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0; i < score.length; i++) {
			pq.add(score[i]);
			if(pq.size() > k) {
				pq.poll();
			}
			
			answer[i] = pq.peek();
		}
		
		return answer;
	}
	
}
