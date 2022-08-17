package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// https://www.acmicpc.net/problem/2440
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j <= N; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		bf.close();
    }
}