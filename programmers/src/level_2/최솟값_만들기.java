package level_2;

import java.util.*;

public class 최솟값_만들기 {

    public static void main(String[] args) {
        
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        System.out.println(solution(A, B));

    }

    private static int solution(int[] A, int[] B) {
        int answer = 0;
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < A.length; i++){
            a.add(A[i]);
            b.add(B[i]);
        }

        for(int i = 0; i < A.length; i++){
            answer += a.poll() * b.poll();
        }

        return answer;
    }
    
}
