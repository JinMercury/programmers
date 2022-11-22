package level_1;

public class 부족한_금액_계산하기 {
	
	public static long solution(int price, int money, int count) {
		long answer = 0;
		long total = 0;
		
		for(int i = 1; i <= count; i++) {
			total += price * i;
		}
		
		if(total > money) {
			answer = total - money;
		} else {
			return 0;
		}
		
		return answer;
	}

	public static void main(String[] args) {

		int price = 3; int money = 20; int count = 4;
		
		System.out.println(solution(price, money, count));

	}

}
