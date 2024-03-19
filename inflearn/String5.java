package inflearn;

import java.util.Scanner;

/**
 *  특정 문자 뒤집기
 *  
 *  input : s!t(u#d*y
 *  output : y!d(u#t*s
 */

public class String5 {
	private String solution(String str) {
		String answer;
		char[] chArr = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(chArr[lt])) lt++;
			else if (!Character.isAlphabetic(chArr[rt])) rt--;
			else {
				char tmp = chArr[lt];
				chArr[lt] = chArr[rt];
				chArr[rt] = tmp;
				
				lt++;
				rt--;
			}
		}
		
		answer = String.valueOf(chArr);
		
		return answer;
	}

	public static void main(String[] args) {
		String5 s5 = new String5();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s5.solution(str));
		sc.close();
	}

}
