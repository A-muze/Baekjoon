package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class acmicpc_3003 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int[] origin = { 1, 1, 2, 2, 2, 8 };
		int[] arr = new int[6];
		
		for (int i = 0; i < 6; i++) {
			arr[i] = origin[i] - Integer.parseInt(st.nextToken());
			
			sb.append(arr[i]).append(" ");
		}
		
		System.out.print(sb);

		br.close();

	}

}
