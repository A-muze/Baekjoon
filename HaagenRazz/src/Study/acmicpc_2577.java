package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class acmicpc_2577 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int value = a * b * c;

        String str = String.valueOf(value);

        for(int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - '0')]++;
        }

        for(int result : arr) {
            System.out.println(result);
        }
    }

}
