package Study;

import java.util.Scanner;

public class acmicpc_2747 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[46];
        arr[1] = 1;

        sc.close();

        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.print(arr[n]);

    }
}
