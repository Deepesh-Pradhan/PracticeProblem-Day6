import java.util.*;

public class fibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a1 = 0;
        int a2 = 1;
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("First " + n + " terms of fibonnaci series: ");
        int i = 1;
        while (i <= n) {
            System.out.print(a1 + " ");
            int sum = a1 + a2;
            a1 = a2;
            a2 = sum;
            i++;
        }
    }
}