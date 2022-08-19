package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// https://www.acmicpc.net/problem/2444
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = n - 1; i > 0; i--) {
			
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			} 
			
			for(int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		bf.close();
		
    }
}