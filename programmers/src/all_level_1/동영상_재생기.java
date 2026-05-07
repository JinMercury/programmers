package all_level_1;

import java.util.*;

public class 동영상_재생기 {
    public static void main (String[] args){
        String video_len = "30:00";
        String pos = "29:55";
        String op_start = "01:00";
        String op_end = "01:30";
        String[] commands = {"next"};

        System.out.println(solution(video_len, pos, op_start, op_end, commands));
    }

    private static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String result = "";

        // commands에 따라 pos 변경
        for(String com : commands) {
            pos = opening(pos, op_start, op_end);
            if (com.equals("prev")) {
                if (pos.compareTo("00:10") >= 0) {
                    pos = subTime(pos);
                } else {
                    pos = "00:00";
                }
            } else {
                if (pos.compareTo(video_len) < 0) {
                    pos = addTime(pos, video_len);
                } else {
                    pos = video_len;
                }
            }
            pos = opening(pos, op_start, op_end);
        }
        result = pos;

        return result;
    }

    // 시간을 10초 더하는 함수
    private static String addTime(String pos, String video_len) {
        String result = "";
        int min = Integer.parseInt(pos.substring(0, 2));
        int sec = Integer.parseInt(pos.substring(3, 5));

        if (sec <= 49) {
            sec += 10;
        } else {
            min += 1;
            sec -= 50;
        }

        result = String.format("%02d", min) + ":" + String.format("%02d", sec);

        if (result.compareTo(video_len) > 0) {
            result = video_len;
        }

        return result;
    }

    // 시간을 10초 빼는 함수
    private static String subTime(String pos) {
        String result = "";
        int min = Integer.parseInt(pos.substring(0, 2));
        int sec = Integer.parseInt(pos.substring(3, 5));

        if (sec >= 10) {
            sec -= 10;
        } else {
            min -= 1;
            sec += 50;
        }

        result = String.format("%02d", min) + ":" + String.format("%02d", sec);

        if(result.compareTo("00:00") < 0) {
            result = "00:00";
        }

        return result;
    }

    // 현재 시간이 오프닝 시간에 포함되어있는지 확인하는 함수
    private static String opening(String now, String op_start, String op_end) {
        String result = "";

        if (now.compareTo(op_start) >= 0 && now.compareTo(op_end) <= 0) {
            result = op_end;
        } else {
            result = now;
        }

        return result;
    }
}