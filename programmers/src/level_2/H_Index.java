package level_2;

import java.util.*;

public class H_Index {

    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        
        System.out.println(solution(citations));
    }

    private static int solution(int[] citations) {
        int result = citations.length;

        Arrays.sort(citations);
        // System.out.println(Arrays.toString(citations));

        for(int c: citations) {
            if(c >= result) break;
            else result -= 1;
        }

        return result;
    }
    
}
