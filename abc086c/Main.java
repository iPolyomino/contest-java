import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // int n = Integer.parseInt(s);
        int N = Integer.parseInt(sc.next());
        int preT = 0;
        int preX = 0;
        int preY = 0;

        for (int i = 0; i < N; i++) {
            int postT = Integer.parseInt(sc.next());
            int postX = Integer.parseInt(sc.next());
            int postY = Integer.parseInt(sc.next());

            int dt = postT - preT;
            int dist = Math.abs(postX - preX) + Math.abs(postY - preY);
            if ((dt < dist) || ((dist - dt) % 2 != 0)) {
                System.out.println("No");
                return;

            }

            preT = postT;
            preX = postX;
            preY = postY;
        }
        System.out.println("Yes");
    }
}
