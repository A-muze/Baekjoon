package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class acmicpc_2920 {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8};
            int[] arrayD = {8, 7, 6, 5, 4, 3, 2, 1};

            int[] arr = new int[8];

            for (int i = 0; i < 8; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            br.close();

            if (Arrays.equals(arrayA, arr)) {
                System.out.print("ascending");
            } else if (Arrays.equals(arrayD, arr)) {
                System.out.print("descending");
            } else {
                System.out.print("mixed");
            }


        } catch (IOException e) { }
    }
}
