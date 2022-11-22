package level_1;

import java.util.*;

public class 최소직사각형 {
	
	public static int solution(int[][] sizes) {
		int answer = 0;
		
		for(int i = 0; i < sizes.length; i++) {
			Arrays.sort(sizes[i]);
		}
		int max1 = 0;
		int max2 = 0;
		
		for(int i = 0; i < sizes.length; i++) {
			if(max1 < sizes[i][0]) max1 = sizes[i][0];
			if(max2 < sizes[i][1]) max2 = sizes[i][1];
		}
		answer = max1 * max2;
		
		return answer;
	}

	public static void main(String[] args) {
		
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int result = solution(sizes);
		
		System.out.println(result);

	}

}
