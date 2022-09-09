package Study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class acmicpc_1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = 0;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            if(isPrime(arr[i]) == true) count += 1;
        }

        System.out.println(count);
    }

    public static boolean isPrime(int num)  {

        if(num < 2) return false;
        if(num == 2) return true;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
