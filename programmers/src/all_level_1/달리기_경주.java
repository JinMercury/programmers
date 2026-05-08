package all_level_1;

import java.util.*;

public class 달리기_경주 {

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solution(players, callings)));
    }

    private static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        int idx = 0;

        for(String player : players) {
            map.put(player, idx++);
        }

        for(String calling : callings) {
            int callingIdx = map.get(calling);
            int prevIdx = callingIdx - 1;

            String prevPlayer = players[prevIdx];
            players[prevIdx] = calling;
            players[callingIdx] = prevPlayer;

            map.put(calling, prevIdx);
            map.put(prevPlayer, callingIdx);
        }
        System.out.println(map);

        return players;
    }

}