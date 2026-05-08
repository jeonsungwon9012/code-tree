import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int deposit = sc.nextInt();
        if(deposit>=3000)System.out.print("book");
        else if(deposit>=1000)System.out.print("mask");
        else System.out.print("no");
    }
}