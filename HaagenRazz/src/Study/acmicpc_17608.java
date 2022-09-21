package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class acmicpc_17608 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            stk.push(Integer.parseInt(br.readLine()));
        }

        int cnt = 1;
        int crnt = 0;
        int height = stk.pop();

        while(!stk.isEmpty()) {
            crnt = stk.pop();
            if(crnt > height) {
                height = crnt;
                cnt++;
            }
        }
            System.out.println(cnt);
    }
}
