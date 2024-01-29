package inflearn;

import java.util.Scanner;

/**
 *  문자찾기
 *  
 *  input : Computercooler c
 *  output : 2
 */

public class String1 {
	
	private int solution(String str, char c) {
		int result = 0;
		
		str = str.toLowerCase();
		c = Character.toLowerCase(c); // char형 변수의 소문자 변환
		
		for(char tmp : str.toCharArray()) { // 향상된 for문, 배열 또는 컬렉션만 가능
			if(tmp == c) result++;
		}
		
		return result;
	}
	 
	public static void main(String[] args) {
		String1 s = new String1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(s.solution(str, c));
	}

}
