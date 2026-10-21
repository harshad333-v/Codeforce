import java.util.Scanner;
 
 
public class A598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
 
 
            long total = n * (n + 1) / 2;
 
 
            long subtract = 0;
            for (long p = 1; p <= n; p *= 2) {
                subtract += p;
            }
 
            long result = total - 2 * subtract;
            System.out.println(result);
        }
    }
}