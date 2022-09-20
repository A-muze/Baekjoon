package Study;

import java.util.Scanner;

public class acmicpc_1157 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();

        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            count[num]++;
        }

        int max = 0;
        char ans = '?';

        for(int i = 0; i < count.length; i++) {
            if(max < count[i]) {
                max = count[i];
                ans = (char)(i + 'A');
            }
            else if(max == count[i]) ans = '?';
        }
        System.out.println(ans);
    }
}
