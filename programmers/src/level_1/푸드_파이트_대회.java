package level_1;

public class 푸드_파이트_대회 {

	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		String answer = "";
		
		for(int i = 1; i < food.length; i++) {
			for(int j = 0; j < food[i] / 2; j++) {
				answer = answer.concat(String.valueOf(i));
			}
		}
		answer = answer.concat("0");
		for(int i = food.length - 1; i > 0; i--) {
			for(int j = 0; j < food[i] / 2; j++) {
				answer = answer.concat(String.valueOf(i));
			}
		}
        System.out.println(answer);

	}

}
