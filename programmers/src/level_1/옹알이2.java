package level_1;
public class 옹알이2 {

	public static void main(String[] args) {
		
		String[] wordArr = {"aya", "ye", "woo", "ma"};
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		
		int cnt = 0;
		
		for(String str : babbling) {
			for(int i = 0; i < wordArr.length;) {
				System.out.println(str);
				
				// wordArr배열에 있는 단어가 포함되어 있으면 그 단어를 " "로 바꾸고
				// 그 뒤에있는 단어가 지운 단어와 같다면 그 단어를 "X"로 바꾼다
				if(str.contains(wordArr[i])) {
					int idx = str.indexOf(wordArr[i]);
					str = str.replaceFirst(wordArr[i], " ");
					
					if(str.length() > idx+1 && str.charAt(idx+1) == wordArr[i].charAt(0)) {
						str = str.replaceFirst(wordArr[i], "X");
					}
					
					i = 0;
				} else i++;
			}
			str = str.replaceAll(" ", "");
			if(str.length() == 0) cnt++;
		}
		System.out.println("답" + cnt);

	}

}
