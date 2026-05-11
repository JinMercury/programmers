package all_level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class 카드_뭉치 {

    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"to", "want"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        
        System.out.println(solution(cards1, cards2, goal));
    }

    private static String solution(String[] cards1, String[] cards2, String[] goal) {
        String result = "";
        String[] check = new String[goal.length];
        ArrayList<String> c1 = new ArrayList<>(Arrays.asList(cards1));
        ArrayList<String> c2 = new ArrayList<>(Arrays.asList(cards2));

        // c1, c2 배열의 첫 카드와 비교 후 check에 저장, null값이면 No 반환
        for(int i = 0; i < goal.length; i++) {
            if(!c1.isEmpty() && goal[i].equals(c1.get(0))) {
                check[i] = c1.get(0);
                c1.remove(0);
            }
            if(!c2.isEmpty() && goal[i].equals(c2.get(0))) {
                check[i] = c2.get(0);
                c2.remove(0);
            }
            if(check[i] == null || check[i].isEmpty()) return "No";
        }
        if(Arrays.equals(goal, check)) result = "Yes";

        return result;
    }
    
}
