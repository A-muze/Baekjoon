package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		// https://www.acmicpc.net/problem/25304

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int x, n, a, b; // 총 금액, 물건의 수, 물건 가격, 개수

		int sum = 0;

		x = Integer.parseInt(bf.readLine());
		n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {

			StringTokenizer st = new StringTokenizer(bf.readLine());

			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			sum += a * b;

		}
		if (x == sum) {
			System.out.println("Yes");

		} else {
			System.out.println("No");
		}

		bf.close();
	}

}