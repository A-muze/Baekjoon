package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// https://www.acmicpc.net/problem/2441
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());

		for (int i = 1; i <= N; i++) {

			for (int k = 0; k <= N - i; k++) {
				System.out.print("*");
			}
			System.out.println();

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

		}
		
		bf.close();
		
    }
}