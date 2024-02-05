package inflearn;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *  문장 속 단어
 *  
 *  input : it is time to study abcde
 *  output : study
 */

public class String3 {
	
	/*
	 * // indexOf(), substring() 사용 안하고 푼 풀이
	 * 
	private String solution(String str) { 
		String answer = "";
		
		StringTokenizer st = new StringTokenizer(str, " ");
		int max = 0;
		while(st.hasMoreTokens()) {
			String tmp = st.nextToken();
			if(tmp.length() > max) {
				max = tmp.length();
				answer = tmp;
			}
		}
		
		return answer;
	}
	*/
	
	// indexOf(), substring() 사용
	private String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE;
		int index = 0;
		while((index = str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, index);
			if(tmp.length()> max) {
				max = tmp.length();
				answer = tmp;
			}
			str = str.substring(index+1);
		}
		
		if(str.length() > max) answer = str;
		
		return answer;
	}

	public static void main(String[] args) {
		String3 s = new String3();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 한 줄 입력
		System.out.println(s.solution(str));

	}

}
