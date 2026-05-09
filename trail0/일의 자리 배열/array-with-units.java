import java.util.*;

public class Main {

    static final int SIZE = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[SIZE];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for (int i = 2; i < SIZE; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
        }

        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}