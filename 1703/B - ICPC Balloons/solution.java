import java.util.*;
 
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Set<Character> solved = new HashSet<>();
            int balloons = 0;
            for (char x : s.toCharArray()) {
                if (solved.contains(x)) {
                    balloons += 1;
                } else {
                    balloons += 2;
                    solved.add(x);
                }
            }
            System.out.println(balloons);
        }
    }
}