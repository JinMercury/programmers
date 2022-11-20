package level_1;

public class 콜라_문제 {

	public static void main(String[] args) {
		
		int a = 3; int b = 1; int n = 20;
		int plus = 0;
		int result = 0;
		
		while(n / a > 0) {
			plus = (n / a) * b;
			result += plus;
			n = (n % a) + plus;
		}
		System.out.println(result);

	}

}
