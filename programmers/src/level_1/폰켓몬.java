package level_1;

import java.util.*;

public class 폰켓몬 {

	public static void main(String[] args) {
		
		int[] nums = { 3,3,3,2,2,2 };
		
		System.out.println(solution(nums));

	}

	private static int solution(int[] nums) {
		int answer = 0;
		int choice = nums.length / 2;
		
		HashSet<Integer> number = new HashSet<>();
		
		for(int i = 0; i < nums.length; i++) {
			number.add(nums[i]);
		}
		
		if(number.size() >= choice) {
			answer = choice;
		} else {
			answer = number.size();
		}
		
		return answer;
	}

}
