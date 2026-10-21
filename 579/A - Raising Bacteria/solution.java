import java.util.Scanner;
 
public class A579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int count = Long.bitCount(x);
 
        System.out.println(count);
    }
}