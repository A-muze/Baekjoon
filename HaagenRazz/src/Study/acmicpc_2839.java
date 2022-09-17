package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class acmicpc_2839 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while(true) {

            if(n % 5 == 0) {
                count += n / 5;
                sb.append(count).append("\n");
                break;
            } else {
                n -= 3;
                count++;
            }

            if(n < 0) {
                sb.append("-1").append("\n");
                break;
            }
        }

        System.out.print(sb);

    }

}
