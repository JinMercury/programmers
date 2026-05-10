package all_level_1;

import java.util.Arrays;

public class 바탕화면_정리 {

    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};
        
        System.out.println(Arrays.toString(solution(wallpaper)));
    }

    private static int[] solution(String[] wallpaper) {
        int[] result = new int[4];

        // wallpaper 이중배열에 저장
        String[][] arr = new String[wallpaper.length][wallpaper[0].length()];
        for(int i = 0; i < wallpaper.length; i++) {
            arr[i] = wallpaper[i].split("");
        }

        // 가장 위 폴더
        label: for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j].equals("#")) {
                    result[0] = i;
                    break label;
                }
            }
        }

        // 가장 왼쪽 폴더
        label: for(int i = 0; i < arr[0].length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j][i].equals("#")) {
                    result[1] = i;
                    break label;
                }
            }
        }

        // 가장 아래 폴더
        label: for(int i = arr.length - 1; i >= 0; i--) {
            for(int j = arr[0].length - 1; j >= 0; j--) {
                if(arr[i][j].equals("#")) {
                    result[2] = i + 1;
                    break label;
                }
            }
        }

        // 가장 오른쪽 폴더
        label: for(int i = arr[0].length - 1; i >= 0; i--) {
            for(int j = arr.length - 1; j >= 0; j--) {
                if(arr[j][i].equals("#")) {
                    result[3] = i + 1;
                    break label;
                }
            }
        }

        /*
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                    System.out.println(minX + " " + minY + " " + maxX + " " + maxY);
                }
            }
        }
        */

        return result;
    }
    
}
