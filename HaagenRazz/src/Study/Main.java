package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static String Underbar = "";
	
	public static void recall(int n) {
		
		String line = Underbar;
		
		if(n == 0) {
			System.out.println(line + "\"����Լ��� ������?\"");
			System.out.println(line + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(line + "��� �亯�Ͽ���.");
			return;
		}
		
		System.out.println(line + "\"����Լ��� ������?\"");
		System.out.println(line + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(line + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(line + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
		Underbar += "____";
		recall(n - 1);
		
		System.out.println(line + "��� �亯�Ͽ���.");
		
	}
	
	public static void main(String[] args) throws IOException {

		// https://www.acmicpc.net/problem/17478
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		System.out.print("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recall(n);
		
	}

}