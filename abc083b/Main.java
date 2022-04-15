import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // int n = Integer.parseInt(s);

        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int n = i;
            int sm = 0;
            while (n > 0) {
                sm += n % 10;
                n /= 10;
            }
            if (sm >= A && sm <= B) {
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}
