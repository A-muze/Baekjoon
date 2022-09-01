package Study;

import java.util.Scanner;

public class acmicpc_1110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        if(n < 10) n *= 10;

        int n1;
        int n2;
        int sum = n;
        int count = 0;

        while(true) {
           n1 = sum / 10;
           n2 = sum % 10;
           sum = n1 + n2;

           sum = n2 * 10 + sum % 10;
           count++;
            if(sum == n) break;
        }
        System.out.println(count);
    }
}
