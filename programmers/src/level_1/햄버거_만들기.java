package level_1;

import java.util.*;

public class 햄버거_만들기 {

	public static void main(String[] args) {
		
		int[] ingredient = { 2, 3, 1 };
		int cnt = 0;
		
		ArrayList<Integer> burger = new ArrayList<Integer>();
		
		for(int i = 0; i < ingredient.length; i++) {
			burger.add(ingredient[i]);
		}
		
		for(int i = 0; i < burger.size() - 3; ) {
			if(burger.get(i) == 1 && burger.get(i+1) == 2 
					&& burger.get(i+2) == 3 && burger.get(i+3) == 1) {
				cnt++;
				burger.remove(i);
				burger.remove(i);
				burger.remove(i);
				burger.remove(i);
				if(i > 2) i -= 2;
				else i = 0;
			} else i++;
		}
		System.out.println(cnt);

	}

}
