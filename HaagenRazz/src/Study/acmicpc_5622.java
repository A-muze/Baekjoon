package Study;

import java.util.Scanner;

public class acmicpc_5622 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            switch (str.charAt(i)) {
                case 'A', 'B', 'C' -> count += 3;
                case 'D', 'E', 'F' -> count += 4;
                case 'G', 'H', 'I' -> count += 5;
                case 'J', 'K', 'L' -> count += 6;
                case 'M', 'N', 'O' -> count += 7;
                case 'P', 'Q', 'R', 'S' -> count += 8;
                case 'T', 'U', 'V' -> count += 9;
                case 'W', 'X', 'Y', 'Z' -> count += 10;
            }
        }
        System.out.print(count);

        sc.close();
    }
}
