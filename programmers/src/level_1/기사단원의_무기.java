package level_1;

import java.util.*;

public class 기사단원의_무기 {

	public static void main(String[] args) {
		
		int number = 5; int limit = 3; int power = 2;
		int result = 0;
		
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		
		for(int i = 1; i <= number; i++) {
			int cnt = 0;
			for(int j = 1; j <= (int)Math.sqrt(i); j++) {
				if(i % j == 0) {
					cnt++;
					if(i / j != j) {
						cnt++;
					}
				}
			}
			numArr.add(cnt);
		}
		for(int i : numArr) {
			if(i <= limit) result += i;
			else result += power;
		}
		System.out.println(result);

	}

}
