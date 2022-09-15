package Study;

public class acmicpc_4673 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        boolean[] chk = new boolean[10001];

        for(int i = 1; i < chk.length; i++) {
            int n = d(i);

            if(n < chk.length) {
                chk[n] = true;
            }
        }

        for(int i = 1; i < chk.length; i++) {
            if(!chk[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);

    }

    public static int d(int num) {
        int sum = num;

        while(num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        return sum;
    }
}
