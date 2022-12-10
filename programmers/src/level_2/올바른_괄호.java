package level_2;

import java.util.*;

public class 올바른_괄호 {

    public static void main(String[] args) {
        String s = "())(()";

        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        
        Stack<String> st = new Stack<>();

        if(s.charAt(0) == ')') return false;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') st.push("(");
            else if(st.empty()) return false;
            else if(s.charAt(i) == ')') st.pop();
        }

        if(st.size() == 0) return true;

        return false;
    }
    
}
