import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < 10; i++) {

            int next = (a + b) % 10;

            System.out.print(next + " ");

            a = b;
            b = next;
        }
    }
}