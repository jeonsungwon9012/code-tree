import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr[i] *= arr[i];
        }

        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}