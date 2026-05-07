package all_level_1;

import java.util.*;

public class 지폐_접기 {

    public static void main (String[] args){
        int[] wallet = {30, 15};
        int[] bill = {26, 17};

        System.out.println(solution(wallet, bill));
    }

    private static int solution(int[] wallet, int[] bill) {
        int result = 0;
        
        // bill과 wallet의 작은 수가 앞에 오도록 정렬
        Arrays.sort(bill);
        Arrays.sort(wallet);

        // bill의 지폐가 wallet의 크기보다 클 때까지 bill의 지폐를 반으로 접음
        while (bill[0] > wallet[0] || bill[1] > wallet[1]) {
            if (bill[0] > bill[1]) {
                bill[0] = bill[0] / 2;
            } else {
                bill[1] = bill[1] / 2;
            }
            result++;

            Arrays.sort(bill);
            Arrays.sort(wallet);
        }

        return result;
    }
    
}
