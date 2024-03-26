package inflearn;

import java.util.Scanner;

/**
 *  중복문자제거
 *  
 *  input : ksekkset
 *  output : kset
 */

public class String6 {
	private String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String6 s6 = new String6();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s6.solution(str));
		sc.close();
	}

}
