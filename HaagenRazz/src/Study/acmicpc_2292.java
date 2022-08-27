package Study;

import java.util.Scanner;

public class acmicpc_2292 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int min_count = 1;
		int range = 2;
		
		sc.close();
		
		if(n == min_count) {
			System.out.print(1);
		} else {
			while(range <= n) {
				range = range + (6 * min_count);
				min_count++;
			}
			System.out.print(min_count);
		}
		
	}
}
