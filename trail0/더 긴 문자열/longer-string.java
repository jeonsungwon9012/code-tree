import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        if(str[0].length() < str[1].length()){
            System.out.print(str[1]+" "+str[1].length());
        }
        else if(str[0].length() > str[1].length()){
            System.out.print(str[0]+" "+str[0].length());
        }
        else{
            System.out.print("same");
        }

        

    }
}