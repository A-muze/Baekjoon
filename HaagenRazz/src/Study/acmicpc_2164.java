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

        for(int i = 1; i <= n; i++) que.offer(i);   // 1부터 n까지 que에 값 넣기

        while(que.size() != 1) {     // 큐의 사이즈가 1이 되면 반복문 종료
            que.remove();   // 큐 맨 앞에 있는 값을 삭제
            int val = que.poll();
            que.offer(val);
        }

        System.out.println(que.peek());

    }
}
