package level_1;

import java.util.*;

public class 숫자_짝꿍 {

	public static void main(String[] args) {
		
		String X = "12321"; String Y = "42531";
		
		int[] xArr = new int[10];
		int[] yArr = new int[10];
		String result = "";
		
		for(int i = 0; i < X.length(); i++) {
			xArr[X.charAt(i) - 48]++;
		}
		for(int i = 0; i < Y.length(); i++) {
			yArr[Y.charAt(i) - 48]++;
		}
		
		for(int i = 9; i >= 0; i--) {
			int temp = 0;
			if(xArr[i] > yArr[i]) {
				temp = yArr[i];
			} else {
				temp = xArr[i];
			}
			if(i == 0 && result.equals("") && temp > 0) {
				System.out.println(0);
			}
			
			for(int j = 0; j < temp; j++) {
				result += i;
			}
		}
		if(result.equals("")) {
			System.out.println(-1);
		}
		System.out.println(result);

	}

}
