package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  단어 뒤집기
 *  
 *  input
 *  3
 *  good
 *  Time
 *  Big
 *  
 *  output
 *  doog
 *  emiT
 *  giB
 */

public class String4 {
	
	/*
	private ArrayList<String> solution(String[] strArr) { // 1. StringBuilder reverse() 이용
		ArrayList<String> answer = new ArrayList<String>();
		
		for(String str : strArr) {
			answer.add(new StringBuilder(str).reverse().toString());
		}
		
		return answer;
	}
	*/
	
	private ArrayList<String> solution(String[] strArr) { // 2. 직접 뒤집기
		ArrayList<String> answer = new ArrayList<String>();
		
		for(String str : strArr) {
			char[] charArr = str.toCharArray();
			int lt = 0, rt = (charArr.length-1);
			
			while(lt < rt) {
				char tmp = charArr[lt];
				charArr[lt] = charArr[rt];
				charArr[rt] = tmp;
				lt++;
				rt--;
			}
			answer.add(String.valueOf(charArr)); // String으로 변환
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String4 s4 = new String4();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		String[] strArr = new String[cnt];
		for(int i = 0; i < cnt; i++) {
			strArr[i] = sc.next();
		}
		
		for(String str : s4.solution(strArr)) {
			System.out.println(str);
		}
		
		sc.close();
	}

}
