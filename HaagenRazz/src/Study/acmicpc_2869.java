package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class acmicpc_2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// A: 낮에 올라갈 수 있는 m
		// B: 자는 동안 미끄러진 m
		// V: 막대 높이 m
		
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