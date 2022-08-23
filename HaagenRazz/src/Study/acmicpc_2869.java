package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class acmicpc_2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// A: ���� �ö� �� �ִ� m
		// B: �ڴ� ���� �̲����� m
		// V: ���� ���� m
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int result = (V - B) / (A - B);
		if( (V - B) % (A - B) != 0) {
			result++;
		}
		
		System.out.println(result);
		
	}

}