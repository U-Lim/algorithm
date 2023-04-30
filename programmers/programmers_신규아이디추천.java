package programmers;

import java.util.Scanner;

public class Solution {
	public String solution(String new_id) {
        String answer = new_id.toLowerCase(); // 1단계
        answer = answer.replaceAll("[^a-z0-9\\-_.]", "") // 2단계
        .replaceAll("\\.{2,}", ".") // 3단계
        .replaceAll("^\\.|\\.$", ""); // 4단계

        if(answer.isEmpty()) answer = "a"; // 5단계
        
        if(answer.length()>=16) answer = answer.substring(0,15).replaceAll("\\.$", ""); // 6단계
        
        char lastChar = answer.charAt(answer.length()-1); // 7단계
        for (; answer.length()<=2;) {
        	answer+=lastChar;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String new_id = sc.next();
		System.out.println(s.solution(new_id));
		sc.close();

	}

}
