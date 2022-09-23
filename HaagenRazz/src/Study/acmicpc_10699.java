package Study;

import java.text.SimpleDateFormat;
import java.util.Date;

public class acmicpc_10699 {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date dt = new Date();

        String date = sdf.format(dt);

        System.out.println(date);

    }
}
