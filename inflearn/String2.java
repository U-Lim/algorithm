package inflearn;

import java.util.Scanner;

/**
 *  대소문자 변환
 *  
 *  input : StuDY
 *  output : sTUdy
 */

public class String2 {
	private String solution (String str) {
		char[] cArr = str.toCharArray();
		int index = 0;
		for(char c : cArr) {
			if(Character.isLowerCase(c)){
				cArr[index] = Character.toUpperCase(c);
			}else {
				cArr[index] = Character.toLowerCase(c);
			}
			index++;
		}
		
		return new String(cArr);
	}

	public static void main(String[] args) {
		String2 s = new String2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s.solution(str));
	}

}
