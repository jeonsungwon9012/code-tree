import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        for(int i= 2; i<10;i++){
            arr[i] = (arr[i-1]+arr[i-2]) % 10;
        }
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}