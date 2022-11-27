package level_1;

import java.util.Arrays;

public class 최대공약수와_최소공배수 {

	public static void main(String[] args) {
		
		int n = 3; int m = 12;
		int[] arr = solution(n, m);
		
		System.out.println(Arrays.toString(arr));

	}

	private static int[] solution(int n, int m) {
		int[] answer = new int[2];
		int gcd = getGcd(n, m);
		
		answer[0] = gcd;
		answer[1] = (n * m) / gcd;
		
		return answer;
	}
	
	public static int getGcd(int num1, int num2) {
		if(num1 % num2 == 0) {
			return num2;
		}
		return getGcd(num2, num1 % num2);
	}

}
