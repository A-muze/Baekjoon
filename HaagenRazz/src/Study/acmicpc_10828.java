package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class acmicpc_10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();

            switch (str) {
                case "push":
                    stk.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (!stk.empty()) {
                        sb.append(stk.pop()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;

                case "size":
                    sb.append(stk.size()).append("\n");
                    break;

                case "empty":
                    if (stk.empty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "top":
                    if (stk.empty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stk.peek()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }

}
