import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        sc.close();

        int ans = 1;
        for (int b = 2; b < X; b++) {
            int i = b * b;
            while (i <= X) {
                ans = Math.max(ans, i);
                i *= b;
            }
        }
        System.out.println(ans);
    }
}
