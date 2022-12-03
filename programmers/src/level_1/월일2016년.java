package level_1;

import java.time.*;

public class 월일2016년 {

	public static void main(String[] args) {
		int a = 5; int b = 24;
		
		System.out.println(solution(a, b));

	}

	private static String solution(int a, int b) {
		LocalDate date = LocalDate.of(2016, a, b);
		DayOfWeek week = date.getDayOfWeek();
		String answer = "";
		
		int day = week.getValue();
		
		switch(day) {
		case 1:
			answer = "MON"; break;
		case 2:
			answer = "TUE"; break;
		case 3:
			answer = "WED"; break;
		case 4:
			answer = "THU"; break;
		case 5:
			answer = "FRI"; break;
		case 6:
			answer = "SAT"; break;
		case 7:
			answer = "SUN"; break;
		}
		
		return answer;
	}

}
