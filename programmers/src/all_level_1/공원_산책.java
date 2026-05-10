package all_level_1;

import java.util.*;

public class 공원_산책 {

    public static void main(String[] args) {
        String[] park = {"OXO", "XSX", "OXO"};
        String[] routes = {"S 1","E 1","W 1","N 1"};
        
        System.out.println(Arrays.toString(solution(park, routes)));
    }

    private static int[] solution(String[] park, String[] routes) {
        int[] result = new int[2];
        String[][] arr = new String[park.length][park[0].length()];

        // park를 이중 배열에 저장
        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[0].length(); j++) {
                arr[i][j] = Character.toString(park[i].charAt(j));
                if(arr[i][j].equals("S")) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        // 공원을 벗어나거나 장애물을 만나는지 확인 후 이동
        for(int i = 0; i < routes.length; i++) {
            String op = Character.toString(routes[i].charAt(0));
            int n = Character.getNumericValue(routes[i].charAt(2));
            boolean flag = false;
            
            if(op.equals("N")) {
                if(result[0] - n >= 0) {
                    for(int j = result[0] - 1; j >= result[0] - n; j--) {
                        if(arr[j][result[1]].equals("X")) {
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        result[0] -= n;
                    }
                }
            } else if(op.equals("S")) {
                if(result[0] + n < park.length) {
                    for(int j = result[0] + 1; j <= result[0] + n; j++) {
                        if(arr[j][result[1]].equals("X")) {
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        result[0] += n;
                    }
                }
            } else if(op.equals("W")) {
                if(result[1] - n >= 0) {
                    for(int j = result[1] - 1; j >= result[1] - n; j--) {
                        if(arr[result[0]][j].equals("X")) {
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        result[1] -= n;
                    }
                }
            } else if(op.equals("E")) {
                if(result[1] + n < park[0].length()) {
                    for(int j = result[1] + 1; j <= result[1] + n; j++) {
                        if(arr[result[0]][j].equals("X")) {
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        result[1] += n;
                    }
                }
            }
        }

        return result;
    }
    
}
