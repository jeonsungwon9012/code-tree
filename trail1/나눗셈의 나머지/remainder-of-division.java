import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();

        while (a > 1) {
            int remain = a % b;

            map.put(remain, map.getOrDefault(remain, 0)+1);

            a /= b;
        }

        int answer = 0;

        for (int count : map.values()) {
            answer += count * count;
        }

        System.out.println(answer);
    }
}