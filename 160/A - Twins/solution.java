import java.util.*;
 
public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();              // number of coins
        int[] coins = new int[n];
        
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();       // coin values
        }
        
        Arrays.sort(coins);                // sort ascending
        int total = 0;
        for (int coin : coins) {
            total += coin;                 // total sum
        }
        
        int mySum = 0, count = 0;
        // pick from largest coin downwards
        for (int i = n - 1; i >= 0; i--) {
            mySum += coins[i];
            count++;
            if (mySum > total - mySum) {
                System.out.println(count);
                break;
            }
        }
    }
}