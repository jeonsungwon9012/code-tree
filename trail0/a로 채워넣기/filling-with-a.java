import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();

        String result =
                str.substring(0, 1)
                + "a"
                + str.substring(2, len - 2)
                + "a"
                + str.substring(len - 1);

        System.out.println(result);
    }
}