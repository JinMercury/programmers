package level_1;

import java.util.*;

public class 성격_유형_검사하기 {
	
	public static String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> aMap = new HashMap<Character,Integer>();
        
        aMap.put('R', 0); aMap.put('T', 0); aMap.put('C', 0); aMap.put('F', 0);
        aMap.put('J', 0); aMap.put('M', 0); aMap.put('A', 0); aMap.put('N', 0);
        
        for(int i = 0; i < survey.length; i++) {
        	if(choices[i] > 4) {
        		aMap.replace(survey[i].charAt(1), aMap.get(survey[i].charAt(1)) + Math.abs(choices[i] - 4));
        	} else if (choices[i] < 4){
        		aMap.replace(survey[i].charAt(0), aMap.get(survey[i].charAt(0)) + Math.abs(choices[i] - 4));
        	}
        }
        System.out.println(aMap.keySet());
        System.out.println(aMap.values());
        
        if(aMap.get('R') >= aMap.get('T')) answer += "R";
        else answer += "T";
        
        if(aMap.get('C') >= aMap.get('F')) answer += "C";
        else answer += "F";
        
        if(aMap.get('J') >= aMap.get('M')) answer += "J";
        else answer += "M";
        
        if(aMap.get('A') >= aMap.get('N')) answer += "A";
        else answer += "N";
        
        return answer;
    }

	public static void main(String[] args) {
		
		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
		int[] choices = { 5, 3, 2, 7, 5 };
		
		System.out.println(solution(survey, choices));

	}

}
