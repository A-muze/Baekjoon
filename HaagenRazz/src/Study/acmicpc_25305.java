package Study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class acmicpc_25305 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i = 0; i < n; i++) {
           arr.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(arr, Collections.reverseOrder());

        System.out.println(arr.get(k - 1));

    }
}
