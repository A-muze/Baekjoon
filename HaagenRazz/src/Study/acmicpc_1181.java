package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class acmicpc_1181 {

    /*
        1. 길이가 짧은 것부터
        2. 길이가 같으면 사전 순으로
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        br.close();

        Arrays.sort(arr, new Comparator<String>() {
            public int compare (String str1, String str2) {
                if (str1.length() == str2.length()) {
                    return str1.compareTo(str2);
                } else {
                    return str1.length() - str2.length();
                }
            }
        });

        sb.append(arr[0]).append('\n');

        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            }
        }

        System.out.println(sb);

    }
}
