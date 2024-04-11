package inflearn;

import java.util.Scanner;

/**
 *  유효한 팰린드롬
 *  
 *  input : found7, time: study; Yduts; emit, 7Dnuof
 *  output : YES 
 */

public class String8 {
	/* 방법 1
	private String solution(String str) {
		String answer = "YES";
		StringBuilder sb = new StringBuilder(str.length());
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) sb.append(str.charAt(i));
		}
		
		if (!sb.toString().equalsIgnoreCase(sb.reverse().toString())) return "NO";
		
		return answer;
	}
	*/
	
	// 방법 2
	private String solution(String str) {
		String answer = "YES";
		StringBuilder sb = new StringBuilder(str.replaceAll("[^a-zA-Z]", ""));
		if (!sb.toString().equalsIgnoreCase(sb.reverse().toString())) return "NO";
		return answer;
	}

	public static void main(String[] args) {
		String8 s8 = new String8();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(s8.solution(str));
		sc.close();

	}

}
