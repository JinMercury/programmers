package level_2;

import java.util.*;

public class 귤_고르기 {

	public static void main(String[] args) {
		int[] tangerine = { 1, 3, 2, 5, 4, 5, 2, 3 };
		int k = 6;
		
		System.out.println(solution(tangerine, k));

	}

	private static int solution(int[] tangerine, int k) {
		int answer = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int tan : tangerine) {
			hm.put(tan, hm.getOrDefault(tan, 0) + 1);
		}
		List<HashMap.Entry<Integer, Integer>> el = new ArrayList<>(hm.entrySet());
		el.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
		
		for(HashMap.Entry<Integer, Integer> entry : el) {
			if(k <= 0) break;
			answer++;
			k -= entry.getValue();
		}
		
		return answer;
	}

}
