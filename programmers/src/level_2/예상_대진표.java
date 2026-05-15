package level_2;

public class 예상_대진표 {

    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 7;
        
        System.out.println(solution(n, a, b));
    }

    private static int solution(int n, int a, int b) {
        int result = 0;

        // 인덱스가 0부터 시작하여 각 -1
        // a -= 1;
        // b -= 1;

        // System.out.println(Integer.toBinaryString(a ^ b));
        // xor연산, 가장 왼쪽 비트가 만나는 라운드
        // 2진수의 길이 반환
        // result = Integer.toBinaryString(a ^ b).length();

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            result++;
        }

        return result;
    }
    
}
