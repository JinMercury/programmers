package all_level_1;

public class 붕대_감기 {

    public static void main (String[] args){
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        System.out.println(solution(bandage, health, attacks));
    }

    private static int solution(int[] bandage, int health, int[][] attacks) {
        int result = -1;
        int healTime = 0;
        int nowHealth = health;

        // 시간 순서대로 공격과 회복 계산
        // 체력이 0 이하가 되면 즉시 종료
        for(int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            boolean attacked = false;
            for(int j = 0; j < attacks.length; j++) {
                if(attacks[j][0] == i) {
                    nowHealth -= attacks[j][1];
                    healTime = 0;
                    attacked = true;
                    if(nowHealth <= 0) {
                        return result;
                    }
                    break;
                } 
            }
            if(!attacked) {
                nowHealth += bandage[1];
                if(nowHealth > health) {
                    nowHealth = health;
                }
                healTime++;
                if(healTime == bandage[0]) {
                    nowHealth += bandage[2];
                    if(nowHealth > health) {
                    nowHealth = health;
                    }  
                    healTime = 0;
                }
            }
            // System.out.println("현재 체력: " + nowHealth);
        }
        if(nowHealth > 0) {
            result = nowHealth;
        }

        return result;
    }
    
}
