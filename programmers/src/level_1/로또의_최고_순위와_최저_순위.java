package level_1;

import java.util.*;

public class 로또의_최고_순위와_최저_순위 {
	
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int cnt = 0;
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i < win_nums.length; i++) {
			nums.add(win_nums[i]);
		}
		
		for(int i = 0; i < lottos.length; i++) {
			if(nums.contains(lottos[i])) {
				cnt++;
			}
		}
		answer[1] = rank(cnt);
		nums.clear();
		for(int i = 0; i < win_nums.length; i++) {
			nums.add(lottos[i]);
		}
		System.out.println(nums);
		for(int i = 0; i < lottos.length; i++) {
			if(nums.get(i) == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		answer[0] = rank(cnt);
		
		return answer;
	}
	
	public static int rank(int cnt) {
		int rank = 0;
		
		switch(cnt) {
			case 2:
				rank = 5;
				break;
			case 3:
				rank = 4;
				break;
			case 4:
				rank = 3;
				break;
			case 5:
				rank = 2;
				break;
			case 6:
				rank = 1;
				break;
			default :
				rank = 6;
		}
		
		return rank;
	}

	public static void main(String[] args) {
		
		int[] lottos = { 44, 1, 0, 0, 31, 25 }; int[] win_nums = { 31, 10, 45, 1, 6, 19 };
		
		int[] answer = solution(lottos, win_nums);
		
		System.out.println(Arrays.toString(answer));

	}

}
