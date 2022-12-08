package level_2;

public class 최댓값과_최솟값 {

    public static void main(String[] args){

        String s = "1 2 3 4";

        System.out.println(solution(s));

    }

    private static String solution(String s) {
        String answer = "";
        String[] num = s.split(" ");

        int max = Integer.valueOf(num[0]);
        int min = Integer.valueOf(num[0]);
        for(String i : num) {
            int n = Integer.valueOf(i);
            if(n < min) min = n;
            if(n > max) max = n;
        }
        answer = min + " " + max;

        return answer;
    }
}
