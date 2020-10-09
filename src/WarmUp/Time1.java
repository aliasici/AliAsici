package WarmUp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time1 {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        System.out.println(today.format(dtf));

        String str ="123";

        int a = Integer.parseInt(str ); // converting from string to int....

        System.out.println(str +1); // 1231
        System.out.println(a +1);//124

        String s1 = "true";
             boolean b1 =Boolean.parseBoolean(s1);
        System.out.println(b1);

        String s2 = "10000.5";
        Double d2 =Double.valueOf(s2); // return wrapper classs...
        System.out.println(d2);

        String s3 = "FalSe";
        boolean b2 =Boolean.valueOf(s3);
        System.out.println(b2);
    }
}
