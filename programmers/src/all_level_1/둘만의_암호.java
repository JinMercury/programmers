package all_level_1;

public class 둘만의_암호 {

    public static void main(String[] args) {
        String s = "klmnopqrstuvwxyz";
        String skip = "abcdefghij";
        int index = 20;
        // opqrstuvwxyzkimn
        
        System.out.println(solution(s, skip, index));
    }

    private static String solution(String s, String skip, int index) {
        String result = "";
        int len = 'z' - 'a' + 1;
        boolean[] isSkip = new boolean[len];

        for(char c : skip.toCharArray()) {
            isSkip[c - 'a'] = true;
        }

        for(char c : s.toCharArray()) {
            int i = c - 'a';
            int cnt = 0;
            while (cnt != index) {
                i = (i + 1) % len;
                if (!isSkip[i]) {
                    cnt++;
                }
            }
            result += (char)('a' + i);
        }

        return result;
    }
    
}
