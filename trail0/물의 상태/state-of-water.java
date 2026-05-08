import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int temperture = sc.nextInt();
        if(temperture>=100) System.out.print("vapor");
        else if(temperture>=0) System.out.print("water");
        else System.out.print("ice");
    }
}