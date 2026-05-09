import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            arr[i] = temp * temp;
            System.out.print(arr[i]+" ");
        }
    }
}