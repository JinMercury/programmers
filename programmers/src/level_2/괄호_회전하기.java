package level_2;

import java.util.*;

public class 괄호_회전하기 {

    public static void main(String[] args) {
        String s = "{(})";
        
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int result = 0;

        List<String> arr = new ArrayList<>(Arrays.asList(s.split("")));

        // 회전
        for (int i = 0; i < arr.size(); i++) {
            Stack<String> sta = new Stack<>();
            boolean flag = true;

            for (int j = 0; j < arr.size(); j++) {
                String ch = arr.get(j);

                // 열린 괄호는 스택에 무조건 넣기
                if (ch.equals("(") || ch.equals("{") || ch.equals("[")) {
                    sta.push(ch);
                } else {
                    // 닫는 괄호에서 스택이 비어있으면 짝이 안맞음
                    if (sta.isEmpty()) {
                        flag = false;
                        break;
                    }
                    
                    // 스택의 맨 위를 꺼내 비교
                    String top = sta.pop();
                    if (ch.equals(")") && !top.equals("(")) {
                        flag = false;
                        break;
                    } else if (ch.equals("}") && !top.equals("{")) {
                        flag = false;
                        break;
                    } else if (ch.equals("]") && !top.equals("[")) {
                        flag = false;
                        break;
                    }
                }
            }
            if (sta.isEmpty() && flag) result++;

            // System.out.println(arr);
            // System.out.println(sta);

            arr.add(arr.get(0));
            arr.remove(0);
        }

        return result;
    }
    
}
