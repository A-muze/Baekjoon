package Study;

import java.util.Scanner;
import java.util.Stack;

public class acmicpc_10773 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();

            if(input == 0) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }
            sc.close();

            int sum = 0;

            for(int val : stack) {
                sum += val;
            }
            System.out.print(sum);
    }
}
