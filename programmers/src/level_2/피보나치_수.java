package level_2;

public class 피보나치_수 {

    public static void main(String[] args){
        
        int n = 1000;

        System.out.println(solution(n));

    }

    private static int solution(int n) {
        int answer = 1;
        int before = 0;

        for(int i = 2; i <= n; i++) {
            answer += before;
            before = answer - before;
            answer %= 1234567;
        }

        return answer;
    }
    
}
