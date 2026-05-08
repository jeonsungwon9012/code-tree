import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=0){
            System.out.print(num);
        }
        else{
            System.out.print(num+"\nminus");
        }
    }
}