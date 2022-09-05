package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class acmicpc_10845 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> qu = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int last = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();

            switch (str) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    qu.offer(last);
                    break;

                case "pop":
                    if (qu.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(qu.poll()).append("\n");
                    }
                    break;

                case "size":
                    sb.append(qu.size()).append("\n");
                    break;

                case "empty":
                    if (qu.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    if (qu.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(qu.peek()).append("\n");
                    }
                    break;

                case "back":
                    if (qu.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(last).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);

    }
}
