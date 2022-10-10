package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class acmicpc_1259 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            String s = br.readLine();
            boolean check = true;

            if (s.equals("0")) break;

            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    check = false;
                    break;
                }
            }

            if (check) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }

        }
        System.out.print(sb);
        br.close();
    }
}