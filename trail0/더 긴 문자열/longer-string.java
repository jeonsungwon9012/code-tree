import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int len1 = str[0].length();
        int len2 = str[1].length();

        if (len1 == len2) {
            System.out.println("same");
        }
        else {
            String longer = len1 > len2 ? str[0] : str[1];
            int length = Math.max(len1, len2);

            System.out.println(longer + " " + length);
        }
    }
}