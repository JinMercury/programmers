package level_1;

import java.util.*;

public class 없는_숫자_더하기 {
	
	public static int solution(int[] numbers) {
		int answer = 0;
		ArrayList<Integer> numArr = new ArrayList<>();
		
		for(int i = 0; i < numbers.length; i++) {
			numArr.add(numbers[i]);
		}
		
		for(int i = 0; i < 10; i++) {
			if(!numArr.contains(i)) {
				answer += i;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		int[] numbers = { 1, 2, 3, 4, 6, 7 ,8, 0 };
		
		System.out.println(solution(numbers));

	}

}
