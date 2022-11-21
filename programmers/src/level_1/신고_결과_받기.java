package level_1;

import java.util.*;

public class 신고_결과_받기 {
	
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		ArrayList<String>[] name = new ArrayList[id_list.length];
		HashMap<String, Integer> cntMap = new HashMap<String, Integer>();
		
		for(String i : id_list) {
			cntMap.put(i, 0);
		}
		
		for(int i = 0; i < id_list.length; i++) {
			name[i] = new ArrayList<String>();
		}
		
		for(int i = 0; i < report.length; i++) {
			String[] arr = report[i].split(" ");
			
			for(int j = 0; j < id_list.length; j++) {
				if(arr[0].equals(id_list[j])) {
					if(name[j].contains(arr[1])) {
						continue;
					} else {
						name[j].add(arr[1]);
						cntMap.replace(arr[1], cntMap.get(arr[1]) + 1);
					}
				}
			}
		}
		
		for(String str : id_list) {
			if(cntMap.get(str) >= k) {
				for(int i = 0; i < name.length; i++) {
					if(name[i].contains(str)) {
						answer[i]++;
					}
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi" };
		int k = 2;
		
		int[] solution = solution(id_list, report, k);
		System.out.println(Arrays.toString(solution));

	}

}
