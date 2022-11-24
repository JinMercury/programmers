package level_1;

import java.util.Arrays;

public class 체육복 {

	public static void main(String[] args) {

		int n = 5; int[] lost = { 2, 4 }; int[] reserve = {1, 3, 5};
		
		System.out.println(solution(n, lost, reserve));

	}

	private static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] cloth = new int[n];
		
		for(int i = 0; i < n; i++) {
			cloth[i]++;
			for(int j = 0; j < lost.length; j++) {
				if(i + 1 == lost[j]) cloth[i]--;
			}
			for(int j = 0; j < reserve.length; j++) {
				if(i + 1 == reserve[j]) cloth[i]++;
			}
		}
		
		for(int i = 0; i < cloth.length; i++) {
			if(cloth[i] == 0) {
				if(i != 0 && cloth[i-1] == 2) {
					cloth[i]++; cloth[i-1]--;
				} else if(i != cloth.length-1 && cloth[i+1] == 2) {
					cloth[i]++; cloth[i+1]--;
				}
			}
		}
		for(int i : cloth) {
			if(i >= 1) answer++;
		}
		
		return answer;
	}

}
