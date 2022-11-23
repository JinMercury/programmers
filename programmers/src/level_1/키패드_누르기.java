package level_1;

public class 키패드_누르기 {
	
	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int left = -1;
		int right = -1;
		
		for(int i = 0; i < numbers.length; i++) {
			int leftDis = 0;
			int rightDis = 0;
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += 'L';
				left = numbers[i];
			} else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += 'R';
				right = numbers[i];
			} else if(numbers[i] == 2) {
				if(left == 1) leftDis = 1; if(right == 3) rightDis = 1;
				if(left == 4) leftDis = 2; if(right == 6) rightDis = 2;
				if(left == 7) leftDis = 3; if(right == 9) rightDis = 3; 
				if(left == -1) leftDis = 4; if(right == -1) rightDis = 4;
				if(left == 2) leftDis = 0; if(right == 2) rightDis = 0;
				if(left == 5) leftDis = 1; if(right == 5) rightDis = 1;
				if(left == 8) leftDis = 2; if(right == 8) rightDis = 2;
				if(left == 0) leftDis = 3; if(right == 0) rightDis = 3;
				if(leftDis < rightDis) {
					answer += 'L';
					left = numbers[i];
				} else if(leftDis > rightDis) {
					answer += 'R';
					right = numbers[i];
				} else {
					if(hand.equals("left")) {
						answer += 'L';
						left = numbers[i];
					} else {
						answer += 'R';
						right = numbers[i];
					}
				}
			} else if(numbers[i] == 5) {
				if(left == 1) leftDis = 2; if(right == 3) rightDis = 2;
				if(left == 4) leftDis = 1; if(right == 6) rightDis = 1;
				if(left == 7) leftDis = 2; if(right == 9) rightDis = 2; 
				if(left == -1) leftDis = 3; if(right == -1) rightDis = 3;
				if(left == 2) leftDis = 1; if(right == 2) rightDis = 1;
				if(left == 5) leftDis = 0; if(right == 5) rightDis = 0;
				if(left == 8) leftDis = 1; if(right == 8) rightDis = 1;
				if(left == 0) leftDis = 2; if(right == 0) rightDis = 2;
				if(leftDis < rightDis) {
					answer += 'L';
					left = numbers[i];
				} else if(leftDis > rightDis) {
					answer += 'R';
					right = numbers[i];
				} else {
					if(hand.equals("left")) {
						answer += 'L';
						left = numbers[i];
					} else {
						answer += 'R';
						right = numbers[i];
					}
				}
			} else if(numbers[i] == 8) {
				if(left == 1) leftDis = 3; if(right == 3) rightDis = 3;
				if(left == 4) leftDis = 2; if(right == 6) rightDis = 2;
				if(left == 7) leftDis = 1; if(right == 9) rightDis = 1; 
				if(left == -1) leftDis = 2; if(right == -1) rightDis = 2;
				if(left == 2) leftDis = 2; if(right == 2) rightDis = 2;
				if(left == 5) leftDis = 1; if(right == 5) rightDis = 1;
				if(left == 8) leftDis = 0; if(right == 8) rightDis = 0;
				if(left == 0) leftDis = 1; if(right == 0) rightDis = 1;
				if(leftDis < rightDis) {
					answer += 'L';
					left = numbers[i];
				} else if(leftDis > rightDis) {
					answer += 'R';
					right = numbers[i];
				} else {
					if(hand.equals("left")) {
						answer += 'L';
						left = numbers[i];
					} else {
						answer += 'R';
						right = numbers[i];
					}
				}
			} else if(numbers[i] == 0) {
				if(left == 1) leftDis = 4; if(right == 3) rightDis = 4;
				if(left == 4) leftDis = 3; if(right == 6) rightDis = 3;
				if(left == 7) leftDis = 2; if(right == 9) rightDis = 2; 
				if(left == -1) leftDis = 1; if(right == -1) rightDis = 1;
				if(left == 2) leftDis = 3; if(right == 2) rightDis = 3;
				if(left == 5) leftDis = 2; if(right == 5) rightDis = 2;
				if(left == 8) leftDis = 1; if(right == 8) rightDis = 1;
				if(left == 0) leftDis = 0; if(right == 0) rightDis = 0;
				if(leftDis < rightDis) {
					answer += 'L';
					left = numbers[i];
				} else if(leftDis > rightDis) {
					answer += 'R';
					right = numbers[i];
				} else {
					if(hand.equals("left")) {
						answer += 'L';
						left = numbers[i];
					} else {
						answer += 'R';
						right = numbers[i];
					}
				}
			}
			
		}
		
		return answer;
	}

	public static void main(String[] args) {

		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";
		
		System.out.println(solution(numbers, hand));

	}

}
