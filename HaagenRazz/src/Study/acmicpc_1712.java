package Study;

import java.util.Scanner;

public class acmicpc_1712 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // ���� ���
		int B = sc.nextInt(); // ���� ���
		int C = sc.nextInt(); // ��ǰ 1�� ����
		
		if(C <= B) {
			System.out.println("-1"); // ���� ����� ��ǰ ���ݰ� ���ų� �� ������ -1
		} else {
			System.out.println((A / (C - B)) + 1);
		}
			
		sc.close();
	}
}
