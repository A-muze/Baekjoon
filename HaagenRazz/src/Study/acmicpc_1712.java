package Study;

import java.util.Scanner;

public class acmicpc_1712 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // 고정 비용
		int B = sc.nextInt(); // 가변 비용
		int C = sc.nextInt(); // 제품 1개 가격
		
		if(C <= B) {
			System.out.println("-1"); // 가변 비용이 제품 가격과 같거나 더 높으면 -1
		} else {
			System.out.println((A / (C - B)) + 1);
		}
			
		sc.close();
	}
}
