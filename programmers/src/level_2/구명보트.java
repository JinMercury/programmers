package level_2;

import java.util.*;

public class 구명보트 {

    public static void main(String[] args){
        
        int[] people = { 70, 80, 50 };
        int limit = 100;

        System.out.println(solution(people, limit));

    }

    private static int solution(int[] people, int limit) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList<>();

        Arrays.sort(people);
        for(int i : people){
            al.add(i);
        }

        while(al.size() > 0){
            if(al.size() == 1) {
                answer++;
                break;
            }
            if(al.get(0) + al.get(al.size()-1) <= limit) {
                answer++;
                al.remove(al.size()-1);
                al.remove(0);
            } else {
                answer++;
                al.remove(al.size()-1);
            }
        }

        return answer;
    }
    
}