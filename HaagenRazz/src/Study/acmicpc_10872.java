package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class acmicpc_10872 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int result = factorial(n);
		
		System.out.println(result);
		
		bf.close();
		
	}
	
	public static int factorial(int n) {
		
		if(n <= 1) return 1;
		
		return n * factorial(n - 1); 
		
	}
}
