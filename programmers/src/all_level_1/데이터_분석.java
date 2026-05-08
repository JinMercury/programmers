package all_level_1;

import java.util.*;

public class 데이터_분석 {

    public static void main(String[] args) {
        // code 코드번호, date 제조일, maximum 최대 수량, remain 현재 수량
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        System.out.println(solution(data, ext, val_ext, sort_by));
    }

    private static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] result;
        ArrayList<int[]> arr = new ArrayList<>();

        for(int i = 0; i < data.length; i++) {
            if(ext.equals("code") && data[i][0] < val_ext) {
                arr.add(data[i]);
            } else if(ext.equals("date") && data[i][1] < val_ext) {
                arr.add(data[i]);
            } else if(ext.equals("maximum") && data[i][2] < val_ext) {
                arr.add(data[i]);
            } else if(ext.equals("remain") && data[i][3] < val_ext) {
                arr.add(data[i]);
            }
        }

        if(sort_by.equals("code")) {
            arr.sort((a, b) -> a[0] - b[0]);
        } else if(sort_by.equals("date")) {
            arr.sort((a, b) -> a[1] - b[1]);
        } else if(sort_by.equals("maximum")) {
            arr.sort((a, b) -> a[2] - b[2]);
        } else if(sort_by.equals("remain")) {
            arr.sort((a, b) -> a[3] - b[3]);
        }
        result = arr.toArray(new int[0][]);

        return result;
    }
    
}
