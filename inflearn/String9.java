package inflearn;

import java.util.Scanner;

/**
 *  숫자만 추출
 *  
 *  input : sdn0vun1ubvo2bf7
 *  output : 127
 */

/**
 *  아스키 코드
 *  '0' = 48
 *  '9' = 57
 */

/**
 *  자바에서 숫자 문자열을 정수형이나 실수형으로 변환할 때,
 *  해당 문자열이 10진수로 해석된다.
 *  이 과정에서 숫자 앞에 있는 0은 특별한 의미를 가지지 않으며, 무시된다.
 */

public class String9 {
	
	
//	방법 1
//	private int solution(String str) {
//		str = str.replaceAll("[^0-9]","");
//		return	Integer.parseInt(str); 
//	} // Integer.parseInt(str)하면 앞의 0알아서 떨어짐
	 
	
	// 방법 2
//	private int solution(String str) {
//		int answer = 0;
//		
//		char[] cArr = str.toCharArray();
//		for(char c : cArr) {
//			if(48 <= c && c <= 57) {
//				answer = answer*10 + (c-48);
//			}
//		}
//		
//		return answer;
//	}
	
	private int solution(String str) {
		String answer = "";
		
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) answer+=c;
		}
		
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		String9 s9 = new String9();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s9.solution(str));
		sc.close();
	}

}
