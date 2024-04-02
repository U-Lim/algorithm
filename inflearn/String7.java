package inflearn;

import java.util.Scanner;

/**
 *  회문문자열
 *  
 *  input : stuTs
 *  output : YES (회문문자열이면 YES, 아니면 NO)
 */

public class String7 {
	/* 방법 1
	private String solution(String str) {
		String answer = "YES";
		str = str.toLowerCase();
		int lt = 0, rt = str.length()-1;
		
		while(lt < rt){
			if(str.charAt(lt) == str.charAt(rt)) {
				lt++;
				rt--;
			}else {
				answer = "NO";
				return answer;
			}
		}
		
		return answer;
	}
	*/
	
	/* 방법 2
	private String solution(String str) {
		String answer = "YES";
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) return "NO";
		}
		
		return answer;
	}
	*/
	
	// 방법 3
	private String solution(String str) {
		String answer = "NO";
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) return "YES";
		
		return answer;
	}
	

	public static void main(String[] args) {
		String7 s7 = new String7();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s7.solution(str));
		sc.close();

	}

}
