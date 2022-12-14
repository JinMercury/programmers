package level_2;

public class 다음_큰_숫자 {

    public static void main(String[] args){
        int n = 78;

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        String bin1 = Integer.toBinaryString(n);
        String bin2;
        int cntbin1 = 0;

        int idx = 0;
        while(idx != -1){
            idx = bin1.indexOf("1", idx);
            if(idx != -1){
                cntbin1++;
                idx++;
            }
        }

        while(true){
            int cntbin2 = 0;
            n++;
            bin2 = Integer.toBinaryString(n);

            idx = 0;
            while(idx != -1){
                idx = bin2.indexOf("1", idx);
                if(idx != -1){
                    cntbin2++;
                    idx++;
                }
                if(cntbin2 > cntbin1) break;
            }
            if(cntbin1 == cntbin2) break;
        }
        answer = n;

        return answer;
    }
    
}
