import java.util.Scanner;
 
public class A2195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                boolean has67 = false;
 
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    if (arr[i] == 67) {
                        has67 = true;
                    }
                }
 
                if (has67) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        
    }
}