package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1;
		int row = 0;
		int col = 0;
		for (int i = 1; i < 10; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			for (int j = 1; j < 10; j++) {
				int intTmp = Integer.parseInt(st.nextToken());
				if (intTmp > max) {
					max = intTmp;
					row = i;
					col = j;
				}
			
			} // for j
		} // for i
		
		System.out.println(max);
		System.out.println(row+" "+col);

	}

}
