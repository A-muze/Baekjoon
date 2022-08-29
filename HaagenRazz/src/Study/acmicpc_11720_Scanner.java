package Study;

import java.util.Scanner;

public class acmicpc_11720_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String in = sc.next();

		sc.close();

		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += in.charAt(i) - 48;
		}

		System.out.println(sum);

	}

}
