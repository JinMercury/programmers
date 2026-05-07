package all_level_1;

import java.util.*;

public class 가장_많이_받은_선물 {

    public static void main (String[] args){
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        System.out.println(solution(friends, gifts));
    }

    private static int solution(String[] friends, String[] gifts) {
        int result = 0;

        Map<String, Integer> giftMap = new HashMap<>();
        int[][] giftCount = new int[friends.length][friends.length];

        for(int i = 0; i < friends.length; i++) {
            giftMap.put(friends[i], i);
        }
        
        // 선물 횟수 기록
        int A, B;
        for(int i = 0; i < gifts.length; i++) {
            A = giftMap.get(gifts[i].split(" ")[0]);
            B = giftMap.get(gifts[i].split(" ")[1]);
            giftCount[A][B]++;
        }
        // System.out.println(Arrays.deepToString(giftCount));

        // 받은 선물과 준 선물의 차이 계산
        int[] point = new int[friends.length];
        for(int i = 0; i < friends.length; i++) {
            for(int j = 0; j < friends.length; j++) {
                point[i] += giftCount[i][j];
                point[j] -= giftCount[i][j];
            }
        }
        // System.out.println(Arrays.toString(point));

        // 다음 선물 받을 사람의 선물 갯수 계산
        int[] nextGift = new int[friends.length];
        for(int i = 0; i < friends.length; i++) {
            for(int j = i + 1; j < friends.length; j++) {
                if(giftCount[i][j] > giftCount[j][i]) {
                    nextGift[i]++;
                } else if(giftCount[i][j] < giftCount[j][i]) {
                    nextGift[j]++;
                } else {
                    if(point[i] > point[j]) {
                        nextGift[i]++;
                    } else if(point[i] < point[j]) {
                        nextGift[j]++;
                    }
                }
            }
        }
        // System.out.println(Arrays.toString(nextGift));

        result = Arrays.stream(nextGift).max().getAsInt();

        return result;
    }
    
}
