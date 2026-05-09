import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // b<a<c 또는 c<a<b 
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            System.out.println(a);
        }
        // a<b<c 또는 c<b<a
        else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            System.out.println(b);
        }
        // a<c<b 또는 b<c<a
        else {
            System.out.println(c);
        }
    }
}