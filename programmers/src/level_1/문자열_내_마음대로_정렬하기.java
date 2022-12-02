package level_1;

import java.util.*;

public class 문자열_내_마음대로_정렬하기 {

	public static void main(String[] args) {
		
		int n = 1;
		String[] sArr = {"sun", "bed", "car"};
		String[] answer = solution(sArr, n);
		
		System.out.println(Arrays.toString(answer));
	}

	private static String[] solution(String[] sArr, int n) {
		ArrayList<String> an = new ArrayList<String>();
		for(String s : sArr) {
			an.add(s);
		}
		String[] answer = new String[sArr.length];
		
		for(int i = 0, x = 0; i < an.size(); x++) {
			char c = sArr[i].charAt(n);
			int idx = i;
			
			for(int j = 0; j < an.size(); j++) {
				if(c > an.get(j).charAt(n)) {
					c = an.get(j).charAt(n);
					idx = j;
				} else if (c == an.get(j).charAt(n)) {
					
				}
			}
			answer[x] = an.get(idx);
			an.remove(idx);
			if(an.size() == 0) break;
		}
		
		return answer;
	}

}
