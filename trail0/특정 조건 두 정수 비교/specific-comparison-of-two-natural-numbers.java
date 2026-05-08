import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if(num1<num2) System.out.print("1 ");
        else System.out.print("0 ");
        if(num1 == num2) System.out.print("1");
        else System.out.print("0");
    }
}