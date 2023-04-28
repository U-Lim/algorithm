package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalCnt = sc.nextInt();
		
		for(int t = 0; t < totalCnt; t++) {
			int cnt = sc.nextInt();
			String str = sc.next();
			StringBuilder sb = new StringBuilder(str.length()*cnt);
			
			for(int i = 0; i < str.length(); i++) {
				for (int j = 0; j < cnt; j++) {
					sb.append(str.charAt(i));
				}
			}
			
			System.out.println(sb);
		}
		
		sc.close();

	}

}
