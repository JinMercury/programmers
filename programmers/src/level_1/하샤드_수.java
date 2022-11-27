package level_1;

public class 하샤드_수 {

	public static void main(String[] args) {

		int x = 11;
		System.out.println(solution(x));

	}

	private static boolean solution(int x) {
		
		int num = 0;
		int xCopy = x;
		while(xCopy != 0) {
			num += xCopy % 10;
			xCopy /= 10;
		}
		
		if(x % num == 0) {
			return true;
		}
		
		return false;
	}

}
