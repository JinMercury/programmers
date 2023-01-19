package level_2;

import java.util.*;

public class 짝지어_제거하기 {
    
    public static void main(String[] args){

        String s = "baabaa";

        System.out.println(Solution(s));

    }

    private static int Solution(String s) {
        int answer = 0;
        Stack<Character> st = new Stack();

        for(int i = 0 ; i < s.length(); i++){
            if(st.empty()) {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == st.peek()){
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        if(st.empty()){
            answer = 1;
        }

        return answer;
    }
}
