package level_1;

import java.util.*;

public class 소수_만들기 {

	public static void main(String[] args) {
		
		int[] nums = { 1,2,3,4 };
		
		System.out.println(solution(nums));

	}

	private static int solution(int[] nums) {
		int answer = 0;
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < nums.length - 2; i++) {
			for(int j = i+1; j < nums.length - 1; j++) {
				for(int x = j+1; x < nums.length; x++) {
					num.add(nums[i] + nums[j] + nums[x]);
				}
			}
		}
		
		for(int i = 0; i < num.size(); i++) {
			if(primeNum(num.get(i))){
				answer += 1;
			}
		}
		
		
		return answer;
	}
	
	public static boolean primeNum(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
