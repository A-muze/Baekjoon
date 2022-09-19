package Study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class acmicpc_2164 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        br.close();

        for(int i = 1; i <= n; i++) que.offer(i);   // 1���� n���� que�� �� �ֱ�

        while(que.size() != 1) {     // ť�� ����� 1�� �Ǹ� �ݺ��� ����
            que.remove();   // ť �� �տ� �ִ� ���� ����
            int val = que.poll();
            que.offer(val);
        }

        System.out.println(que.peek());

    }
}
